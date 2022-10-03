package com.superaluno.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superaluno.entities.MateriaEntity;
import com.superaluno.entities.dtos.MateriaEntityDTO;
import com.superaluno.services.MateriaService;

@RestController
@CrossOrigin("*")
@RequestMapping("/materias")
public class MateriaController {
	
	@Autowired
	private MateriaService materiaService;
	
	@GetMapping("/{idMateria}")
	public MateriaEntityDTO findById(@PathVariable Long idMateria) {
		MateriaEntity materia = this.materiaService.findById(idMateria);
		MateriaEntityDTO materiaDTO = new MateriaEntityDTO(materia);
		return materiaDTO;
	}

}
