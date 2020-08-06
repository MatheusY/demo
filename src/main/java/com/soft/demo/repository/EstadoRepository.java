package com.soft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.demo.domain.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Short> {

}
