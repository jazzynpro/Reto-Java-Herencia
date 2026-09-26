package com.krakedev.herencia;

public class Hija extends Padre implements Cantante{
	//Constructor vacio
	public Hija() {
		super();
	}
	
	//Constructor de hija
	public Hija(int virtudes, int defectos, int munecas) {
		//llamamos al contructor del padre sin usar this.virtudes
		super(virtudes, defectos);
		this.munecas = munecas;
	}

	//podemos no poder atributos porque los esta herendo de Padre
	//atributo solo de la hija}
	private int munecas;
	
	//Getters and Setters munecas
	public int getMunecas() {
		return munecas;
	}

	public void setMunecas(int munecas) {
		this.munecas = munecas;
	}

	//metodo 
	@Override
	public void imprimir() {
		System.out.println("Virtudes: " + getVirtudes() + "\nDefectos: " + getDefectos() + "\nMuñecas: " + getMunecas());
	}

	@Override
	public String toString() {
		return "Hija [munecas=" + munecas + "] " +super.toString();
	}

	@Override
	public void cantar() {
	System.out.println("Cantando x2");
		
	}



	
	
}
