package com.soft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.demo.domain.entity.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Short> {

}
