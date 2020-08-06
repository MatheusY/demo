package com.soft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.demo.domain.entity.DadoBancario;

public interface DadoBancarioRepository extends JpaRepository<DadoBancario, Long> {

}
