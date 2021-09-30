package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import Inter.artículo;

public class Comidas {
	private List<artículo> artículos = new ArrayList<artículo>();	

	   public void addartículos(artículo artículos){
	      artículo.add(artículos);
		   
	   }

	   public float getCost(){
	      float cost = 0.0f;
	      
	      for (artículo artículos : artículos) {
	         cost += artículos.price();
	      }		
	      return cost;
	   }

	   public void showItems(){
	   
	      for (artículo artículos : artículos) {
	         System.out.print("articulo : " + artículos.nombre());
	         System.out.print(", embalaje : " + artículos.Embalaje().paquete());
	         System.out.println(", Price : " + artículos.price());
	      }		
	   }	
	}

