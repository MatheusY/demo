package com.soft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.demo.domain.entity.EstadoCivil;

public interface EstadoCivilRepository extends JpaRepository<EstadoCivil, Short> {

}
