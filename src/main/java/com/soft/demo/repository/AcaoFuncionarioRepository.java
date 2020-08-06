package com.soft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.soft.demo.domain.entity.AcaoFuncionario;

public interface AcaoFuncionarioRepository extends JpaRepository<AcaoFuncionario, Long> {

	@Query("SELECT acao FROM AcaoFuncionario acao JOIN FETCH acao.estadoCivil JOIN FETCH acao.cargo WHERE acao.id = :id ")
	AcaoFuncionario findfetchBydId(@Param("id") Long id);

}
