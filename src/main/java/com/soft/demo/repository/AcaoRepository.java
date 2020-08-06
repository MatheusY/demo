package com.soft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.demo.domain.entity.Acao;

public interface AcaoRepository extends JpaRepository<Acao, Short> {

}
