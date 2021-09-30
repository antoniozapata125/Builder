package Gaseosas;

import Inter.artículo;

public abstract class Bebida_fria implements artículo {

	@Override
	public String Embalaje() {
		return new Botella();
		
	}
	@Override
	public abstract float price();
	
}
