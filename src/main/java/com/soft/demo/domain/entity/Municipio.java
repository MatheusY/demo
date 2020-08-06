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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_MUNICIPIO")
public class Municipio extends AbstractDominioEntity<Integer> {

	private static final long serialVersionUID = 1L;

	@Column(name = "nome", unique = true)
	private String nome;

}
