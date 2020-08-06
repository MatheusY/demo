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
@Table(name = "TB_CARGO")
public class Cargo extends AbstractDominioEntity<Short> {

	private static final long serialVersionUID = 1L;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "area")
	private String area;

}
