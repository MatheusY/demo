package com.soft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.demo.domain.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
