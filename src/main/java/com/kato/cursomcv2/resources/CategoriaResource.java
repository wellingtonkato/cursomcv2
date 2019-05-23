package com.kato.cursomcv2.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kato.cursomcv2.domain.Categoria;
import com.kato.cursomcv2.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")

public class CategoriaResource {
	
	@Autowired   //para instanciar a classe
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	                          //@pathVariable usado para dizer q o {id} do RequestMapping é igual ao Integer id 
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
}
