package com.superaluno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superaluno.entities.AssuntoEntity;

@Repository
public interface AssuntoRepository extends JpaRepository<AssuntoEntity, Long> {
	
	AssuntoEntity findByIdAssunto(Long idAssunto);

	AssuntoEntity findAssuntoByNomeAssunto(String nomeAssunto);

}
