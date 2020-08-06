package com.soft.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.soft.demo.domain.VO.FuncionarioVO;
import com.soft.demo.domain.entity.Funcionario;
import com.soft.demo.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController extends AbstractController {

	@Autowired
	FuncionarioService funcionarioService;

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Long salvar(@RequestBody FuncionarioVO funcionario) {
		return funcionarioService.salvar(convertVOToEntity(funcionario, Funcionario.class));
	}

	@PatchMapping("/aprovado/{idProtocolo}")
	@ResponseStatus(HttpStatus.OK)
	public void aprovar(@PathVariable Long idProtocolo) {
		funcionarioService.aprovar(idProtocolo);
	}

}
