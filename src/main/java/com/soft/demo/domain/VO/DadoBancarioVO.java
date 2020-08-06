package com.soft.demo.domain.VO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadoBancarioVO {

	private Long id;

	private Integer numero;

	private Integer agencia;

	private FuncionarioVO funcionario;

	private BancoVO banco;
}
