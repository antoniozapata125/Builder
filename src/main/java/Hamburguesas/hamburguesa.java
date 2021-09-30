package Hamburguesas;

import Inter.artículo;
import Inter.embalaje;

public abstract class hamburguesa implements artículo {
	@Override
	public String Embalaje() {
		return new Envoltura();
		
	}
	@Override
	public abstract float price();
	}

