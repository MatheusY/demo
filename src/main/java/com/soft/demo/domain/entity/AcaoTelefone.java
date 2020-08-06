package com.soft.demo.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_ACAO_TELEFONE")
public class AcaoTelefone extends AbstractTelefone {

	private static final long serialVersionUID = 1L;

}
