package com.soft.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.demo.domain.entity.AcaoFuncionario;
import com.soft.demo.domain.entity.Funcionario;
import com.soft.demo.domain.entity.Protocolo;
import com.soft.demo.repository.AcaoFuncionarioRepository;
import com.soft.demo.repository.FuncionarioRepository;

@Service
public class FuncionarioServiceImpl extends ProtocoloServiceImpl implements FuncionarioService {

	@Autowired
	AcaoFuncionarioRepository acaoFuncionarioRepository;

	@Autowired
	FuncionarioRepository funcionarioRepository;

	@Override
	public Long salvar(Funcionario funcionario) {
		return registrar(funcionario, salvar, null).getId();
	}

	@Override
	public void aprovar(Long idProtocolo) {
		Protocolo protocolo = aprovado(idProtocolo);
		if (protocolo.getAcao().getId().equals(salvar.getId())) {
			AcaoFuncionario acaoFuncionario = acaoFuncionarioRepository.findfetchBydId(protocolo.getFuncionarioAcao().getId());
			Funcionario funcionario = new Funcionario(acaoFuncionario);
			funcionarioRepository.save(funcionario);
		}
	}

}
