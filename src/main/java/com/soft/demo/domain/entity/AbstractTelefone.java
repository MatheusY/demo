package com.soft.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractTelefone extends AbstractEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Column(name = "numero", length = 9)
	private String numero;

	@Column(name = "ddd", length = 2)
	private String ddd;

	@Column(name = "fixo")
	private Boolean fixo;
}
