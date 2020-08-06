package com.soft.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractFuncionario extends AbstractEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Column(name = "nome")
	protected String nome;

	@Column(name = "cpf")
	protected String cpf;

	@Column(name = "salario")
	protected Double salario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ESTADO_CIVIL", referencedColumnName = "ID")
	protected EstadoCivil estadoCivil;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CARGO", referencedColumnName = "ID")
	protected Cargo cargo;
}
