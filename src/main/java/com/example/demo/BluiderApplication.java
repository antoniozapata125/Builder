package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class BluiderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BluiderApplication.class, args);
		
		clase_comida Clase_comida = new clase_comida();
		
		Comidas vegComidas = Clase_comida.prepareVegComidas();
				System.out.println(" Comida vegetariana");
				vegComidas.showItems();
				System.out.println(" Total Cost :" + vegComidas.getCost());
				
				Comidas nonComidas = Clase_comida.prepareNonVegComidas();
				System.out.println("\n\nNon-Comida vegetariana");
				nonComidas.showItems();
			      System.out.println("Total Cost: " + nonComidas.getCost());
				
	}


	}


