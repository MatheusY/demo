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
public abstract class AbstractEndereco extends AbstractEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Column(name = "rua")
	protected String rua;

	@Column(name = "numero")
	protected Integer numero;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MUNICIPIO", referencedColumnName = "ID")
	protected Municipio municipio;
}
