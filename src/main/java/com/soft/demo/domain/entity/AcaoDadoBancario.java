package com.soft.demo.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_ACAO_DADO_BANCARIO")
public class AcaoDadoBancario extends AbstractDadoBancario {

	private static final long serialVersionUID = 1L;
}
