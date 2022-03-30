package com.codingdojo.fabian;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto auto1 = new Auto (2010, "Honda", "Civic", "rojo", 4, "1234ABC");
		
		String auto1Marca = auto1.getMarca();
		String auto1Modelo = auto1.getModelo();
		
		auto1.informacion();
		
		System.out.println ("Marca: "+auto1Marca+" Modelo:"+auto1Modelo);
		
		
		Vehiculo bici = new Vehiculo (2015, "MarcaBici", "Nuevo modelo", "Blanca", 2);
		
//		String biciMarca = bici.getMarca();
//		String biciModelo = bici.getModelo();
//		
		bici.informacion();
		
		System.out.println(auto1.info());
	}

}
