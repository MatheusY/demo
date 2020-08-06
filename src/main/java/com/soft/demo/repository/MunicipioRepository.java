package com.soft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.demo.domain.entity.Municipio;

public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {

}
