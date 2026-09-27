package com.krakedev.herencia;

public class Padre implements Cantante{
	//Solo se puede heredar los metodos y los atributos si son publicos
	private int virtudes;
	private int defectos;
	private double totalAhorros;
	private String nombre;
	
	//Constructor vacio
	public Padre() {
		
	}
	
	public Padre(int virtudes, int defectos, String nombre) {
		this.virtudes = virtudes;
		this.defectos = defectos;
		this.nombre = nombre;
	}
	
	//Getters and Setters
	
	public double getTotalAhorros() {
		return totalAhorros;
	}
	public void setTotalAhorros(double totalAhorros) {
		this.totalAhorros = totalAhorros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	public int getDefectos() {
		return defectos;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	
	//Metodo imprimir
	public void imprimir() {
		System.out.println("Virtudes: "+virtudes + "Defectos: " +defectos);
	}
	
	
	@Override
	public void cantar() {
		System.out.println("Cantando...");
		
	}

	
	
	@Override
	public String toString() {
		return "Padre [virtudes=" + virtudes + ", defectos=" + defectos + ", totalAhorros=" + totalAhorros + ", nombre="
				+ nombre + "]";
	}

	//metodo total ahorros
	public void ahorrar(double monto) {
		totalAhorros += monto;
	}
	
	
}
