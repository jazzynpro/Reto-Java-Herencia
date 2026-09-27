package com.krakedev.test;

import com.krakedev.herencia.Hija;

public class TestHija {

	public static void main(String[] args) {
		Hija hija = new Hija(6,8,"Carla",2);
		
		hija.imprimir();
		
		hija.setVirtudes(5);
		
		
		hija.imprimir();
		
		hija.cantar();
		
		
		System.out.println(hija.toString());
		
	}

}
