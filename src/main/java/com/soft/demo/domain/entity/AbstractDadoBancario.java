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
public class AbstractDadoBancario extends AbstractEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Column(name = "numero")
	private Integer numero;

	@Column(name = "agencia")
	private Integer agencia;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_BANCO", referencedColumnName = "ID")
	private Banco banco;
}
