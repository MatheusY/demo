package com.soft.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_ESTADO")
public class Estado extends AbstractDominioEntity<Short> {

	private static final long serialVersionUID = 1L;

	@Column(name = "nome")
	private String nome;

	public Estado(Short id) {
		this.id = id;
	}
}
