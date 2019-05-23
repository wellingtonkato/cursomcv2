package com.kato.cursomcv2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kato.cursomcv2.domain.Categoria;
import com.kato.cursomcv2.repositories.CategoriaRepository;

//CommandLineRunner é usado para instaciar algo no inicio


@SpringBootApplication
public class Cursomcv2Application implements CommandLineRunner{ 
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Cursomcv2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
		
	}

}
