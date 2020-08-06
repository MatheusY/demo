package com.soft.demo.domain.VO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TelefoneVO {

	private Long id;

	private String numero;

	private String ddd;

	private Boolean fixo;

	private FuncionarioVO funcionario;
}
