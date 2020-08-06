package com.soft.demo.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_ACAO_ENDERECO")
public class AcaoEndereco extends AbstractEndereco {

	private static final long serialVersionUID = 1L;

	public AcaoEndereco(AbstractEndereco endereco) {
		municipio = endereco.getMunicipio();
		numero = endereco.getNumero();
		rua = endereco.getRua();
	}
}
