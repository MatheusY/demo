package com.soft.demo.service;

import com.soft.demo.domain.entity.Funcionario;

public interface FuncionarioService {

	Long salvar(Funcionario funcionario);

	void aprovar(Long idProtocolo);
}
