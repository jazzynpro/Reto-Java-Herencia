package com.krakedev.herencia;

public class Hijo extends Padre {
	private int juguetes;
	
	public Hijo(int virtudes, int defectos,String nombre, int juguetes) {
		super(virtudes, defectos, nombre);
		this.juguetes = juguetes;
	}

	public int getJuguetes() {
		return juguetes;
	}

	public void setJuguetes(int juguetes) {
		this.juguetes = juguetes;
	}
	
	//Metodo ahorrar
	@Override
	public void ahorrar(double monto) {
		this.setTotalAhorros(getTotalAhorros()+(monto*0.5));
	}

	@Override
	public String toString() {
		return "Hijo [juguetes=" + juguetes + "]" + super.toString();
	}
	
}
