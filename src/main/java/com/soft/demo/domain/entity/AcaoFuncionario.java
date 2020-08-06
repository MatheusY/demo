package com.soft.demo.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "TB_ACAO_FUNCIONARIO")
public class AcaoFuncionario extends AbstractFuncionario {

	private static final long serialVersionUID = 1L;

	public AcaoFuncionario(AbstractFuncionario funcionario) {
		cpf = funcionario.getCpf();
		nome = funcionario.getNome();
		salario = funcionario.getSalario();
		estadoCivil = funcionario.getEstadoCivil();
		cargo = funcionario.getCargo();
	}
}
