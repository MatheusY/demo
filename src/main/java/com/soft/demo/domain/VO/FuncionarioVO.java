package com.soft.demo.domain.VO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuncionarioVO {

	private String nome;

	private String cpf;

	private EstadoCivilVO estadoCivil;

	private CargoVO cargo;

	private Double salario;

}
