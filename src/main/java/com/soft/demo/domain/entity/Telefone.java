package com.soft.demo.domain.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_TELEFONE")
public class Telefone extends AbstractTelefone {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "ID_FUNCIONARIO", referencedColumnName = "ID")
	private Funcionario funcionario;
}
