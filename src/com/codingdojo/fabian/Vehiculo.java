package com.codingdojo.fabian;

public class Vehiculo {
	
	private int a�o;
	private String marca;
	private String modelo;
	private String color;
	private int ruedas;
	

	public Vehiculo(int a�o, String marca, String modelo, String color, int ruedas) {
		this.a�o = a�o;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.ruedas = ruedas;
	}

	
	
	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	
	public void informacion () {
		System.out.println("Marca: "+this.marca+" Modelo: "+this.modelo+" A�o: "+this.a�o+ " Color: "+this.color);
	}
	
	public String info () {
		return "Marca:" +this.marca+" Modelo:"+this.modelo+" A�o: "+this.a�o+ " Color:"+this.color;
	}
	
	

}
