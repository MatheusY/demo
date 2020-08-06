package com.soft.demo.domain.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "TB_FUNCIONARIO")
public class Funcionario extends AbstractFuncionario {

	public Funcionario(AcaoFuncionario acaoFuncionario) {
		nome = acaoFuncionario.getNome();
		cpf = acaoFuncionario.getCpf();
		salario = acaoFuncionario.getSalario();
		estadoCivil = acaoFuncionario.getEstadoCivil();
		cargo = acaoFuncionario.getCargo();
	}

	private static final long serialVersionUID = 1L;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "funcionario")
	private Endereco endereco;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionario")
	private List<Telefone> telefones;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "funcionario")
	private DadoBancario dadoBancario;
}
