package com.soft.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.soft.demo.domain.entity.Acao;
import com.soft.demo.domain.entity.Banco;
import com.soft.demo.domain.entity.Cargo;
import com.soft.demo.domain.entity.Estado;
import com.soft.demo.domain.entity.EstadoCivil;
import com.soft.demo.domain.entity.Municipio;
import com.soft.demo.repository.AcaoRepository;
import com.soft.demo.repository.BancoRepository;
import com.soft.demo.repository.CargoRepository;
import com.soft.demo.repository.EstadoCivilRepository;
import com.soft.demo.repository.EstadoRepository;
import com.soft.demo.repository.MunicipioRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Component
class InsertDominio implements CommandLineRunner {

	@Autowired
	private MunicipioRepository municipioRepository;

	@Autowired
	private BancoRepository bancoRepository;

	@Autowired
	private EstadoRepository estadoRespository;

	@Autowired
	private CargoRepository cargoRepository;

	@Autowired
	private EstadoCivilRepository estadoCivilRepository;

	@Autowired
	private AcaoRepository acaoRepository;

	@Override
	public void run(String... args) throws Exception {
		Municipio municipio = new Municipio("São Paulo");
		municipioRepository.save(municipio);
		municipio = new Municipio("Santo André");
		municipioRepository.save(municipio);
		municipio = new Municipio("Diadema");
		municipioRepository.save(municipio);

		Banco banco = new Banco("Itaú");
		bancoRepository.save(banco);
		banco = new Banco("Bradesco");
		bancoRepository.save(banco);
		banco = new Banco("Santander");
		bancoRepository.save(banco);

		Estado estado = new Estado("Em análise");
		estadoRespository.save(estado);
		estado = new Estado("Aprovado");
		estadoRespository.save(estado);
		estado = new Estado("Rejeitado");
		estadoRespository.save(estado);

		Cargo cargo = new Cargo("Gerente de projeto", "Gestão");
		cargoRepository.save(cargo);
		cargo = new Cargo("Desenvolvedor", "TI");
		cargoRepository.save(cargo);
		cargo = new Cargo("Recrutador", "RH");
		cargoRepository.save(cargo);

		EstadoCivil estadoCivil = new EstadoCivil("Solteiro");
		estadoCivilRepository.save(estadoCivil);
		estadoCivil = new EstadoCivil("Casado");
		estadoCivilRepository.save(estadoCivil);
		estadoCivil = new EstadoCivil("Divorciado");
		estadoCivilRepository.save(estadoCivil);

		Acao acao = new Acao("Cadastrar");
		acaoRepository.save(acao);
		acao = new Acao("Editar");
		acaoRepository.save(acao);
		acao = new Acao("Remover");
		acaoRepository.save(acao);

	}

}