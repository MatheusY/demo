package com.soft.demo.service;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.soft.demo.domain.entity.AbstractEndereco;
import com.soft.demo.domain.entity.AbstractEntity;
import com.soft.demo.domain.entity.AbstractFuncionario;
import com.soft.demo.domain.entity.Acao;
import com.soft.demo.domain.entity.AcaoEndereco;
import com.soft.demo.domain.entity.AcaoFuncionario;
import com.soft.demo.domain.entity.Endereco;
import com.soft.demo.domain.entity.Estado;
import com.soft.demo.domain.entity.Funcionario;
import com.soft.demo.domain.entity.Protocolo;
import com.soft.demo.repository.ProtocoloRepository;

public class ProtocoloServiceImpl {

	protected static Acao salvar;
	protected static Acao editar;
	protected static Acao remover;

	protected static Estado emAnalise;
	protected static Estado aprovado;
	protected static Estado rejeitado;

	static {
		salvar = new Acao((short) 1);
		editar = new Acao((short) 2);
		remover = new Acao((short) 3);

		emAnalise = new Estado((short) 1);
		aprovado = new Estado((short) 2);
		rejeitado = new Estado((short) 3);
	}

	@Autowired
	ProtocoloRepository protocoloRepository;

	protected <E extends AbstractEntity<?>> Protocolo registrar(E entity, Acao acao, Long idPai) {
		Protocolo protocolo = new Protocolo();
		protocolo.setAcao(acao);
		protocolo.setEstado(emAnalise);
		if (Objects.nonNull(idPai)) {

			Optional<Protocolo> protocoloParent = protocoloRepository.findById(idPai);
			if (protocoloParent.isPresent()) {
				protocolo.setDependencia(protocoloParent.get());
			}
		}
		if (entity instanceof Funcionario) {
			AcaoFuncionario acaoFuncionario = new AcaoFuncionario((AbstractFuncionario) entity);
			protocolo.setFuncionarioAcao(acaoFuncionario);
		} else if (entity instanceof Endereco) {
			AcaoEndereco acaoEndereco = new AcaoEndereco((AbstractEndereco) entity);
			protocolo.setEnderecoAcao(acaoEndereco);
		}

		try {
			return protocoloRepository.saveAndFlush(protocolo);
		} catch (DataIntegrityViolationException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Valor inserido incorretamente");
		}

	}

	protected Protocolo aprovado(Long id) {
		Protocolo protocolo = validProtocolo(id);
		protocolo.setEstado(aprovado);
		return protocoloRepository.save(protocolo);
	}

	private Protocolo validProtocolo(Long id) {
		Optional<Protocolo> oProtocolo = protocoloRepository.findByFetchId(id);
		if (oProtocolo.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Protocolo não encontrado");
		}
		Protocolo protocolo = oProtocolo.get();
		if (protocolo.getEstado().getId().equals(aprovado)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Protocolo já foi aprovado");
		}
		if (Objects.nonNull(protocolo.getDependencia()) && !protocolo.getDependencia().getEstado().getId().equals(aprovado.getId())) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "É necessário aprovar outas dependencias");
		}
		return protocolo;
	}
}
