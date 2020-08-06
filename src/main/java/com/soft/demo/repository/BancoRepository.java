package com.soft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.demo.domain.entity.Banco;

public interface BancoRepository extends JpaRepository<Banco, Integer> {

}
