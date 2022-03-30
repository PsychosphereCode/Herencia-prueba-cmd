package com.codingdojo.fabian;

public class Auto extends Vehiculo {
	
	private String placas;

	

	public Auto(int año, String marca, String modelo, String color, int ruedas, String placas) {
		super(año, marca, modelo, color, ruedas);
		this.placas = placas;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	
	public void informacion () {
		super.informacion();
		System.out.println("Placas:"+this.placas);
	}
	
	public String info() {
		String inf = super.info();
		return inf+" Placas:"+this.placas;
		
	}

}
