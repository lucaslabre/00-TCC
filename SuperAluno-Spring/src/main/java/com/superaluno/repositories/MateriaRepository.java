package com.superaluno.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superaluno.entities.MateriaEntity;

@Repository
public interface MateriaRepository extends JpaRepository<MateriaEntity, Long> {
	
	Optional<MateriaEntity> findMateriaByIdMateria(Long idMateria);

}
