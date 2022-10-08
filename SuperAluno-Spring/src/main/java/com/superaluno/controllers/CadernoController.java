package com.superaluno.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superaluno.entities.CadernoEntity;
import com.superaluno.entities.dtos.CadernoEntityDTO;
import com.superaluno.services.CadernoService;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "cadernos")
public class CadernoController {
	
	@Autowired
	private CadernoService cadernoService;
	
	@GetMapping("/{idUsuario}")
	public List<CadernoEntityDTO> findAllCadernoByUsuario(@PathVariable Long idUsuario) {
		List<CadernoEntity> cadernos = this.cadernoService.findAllCadernoByUsuario(idUsuario);
		List<CadernoEntityDTO> cadernosDTO = new ArrayList<>();
		for(CadernoEntity caderno : cadernos) {
			cadernosDTO.add(new CadernoEntityDTO(caderno));
		}
		return cadernosDTO;
	}

}
