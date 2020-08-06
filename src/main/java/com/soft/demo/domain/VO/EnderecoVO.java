package com.soft.demo.domain.VO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoVO {

	private Long id;

	private String rua;

	private Integer numero;

	private MunicipioVO municipio;
}
