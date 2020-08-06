package com.soft.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.soft.demo.domain.entity.Protocolo;

public interface ProtocoloRepository extends JpaRepository<Protocolo, Long> {

	@Query("SELECT protocolo FROM Protocolo protocolo " //
			+ "LEFT JOIN FETCH protocolo.funcionario " //
			+ "LEFT JOIN FETCH protocolo.endereco " //
			+ "LEFT JOIN FETCH protocolo.telefone " //
			+ "LEFT JOIN FETCH protocolo.funcionarioAcao " //
			+ "LEFT JOIN FETCH protocolo.enderecoAcao " //
			+ "LEFT JOIN FETCH protocolo.telefoneAcao " //
			+ "JOIN FETCH protocolo.acao " //
			+ "JOIN FETCH protocolo.estado " //
			+ "LEFT JOIN FETCH protocolo.dependencia dependencia " //
			+ "LEFT JOIN FETCH dependencia.estado " //
			+ "WHERE protocolo.id = :id")
	Optional<Protocolo> findByFetchId(@Param("id") Long id);

}
