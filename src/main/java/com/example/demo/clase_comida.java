package com.example.demo;

import Gaseosas.Coca;
import Gaseosas.Pepsi;
import Hamburguesas.Hambur_pollo;
import Hamburguesas.VegBurger1;

public class clase_comida {

	public Comidas prepareVegComidas(){
	Comidas comida = new Comidas();
	comida.addartículos(new VegBurger1());
	comida.addartículos(new Coca());
	return comida;	
	}
	
	public Comidas prepareNonVegComidas() {
		Comidas comida = new Comidas();
		comida.addartículos(new Hambur_pollo());
		comida.addartículos(new Pepsi());
		return comida;
		
	}
}
