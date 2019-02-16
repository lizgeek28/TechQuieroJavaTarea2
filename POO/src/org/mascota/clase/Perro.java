package org.mascota.clase;

public class Perro extends Mascota 
{
	private String raza;
	private double longitud;
	private boolean genero;
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza; //This indica el atributo que se va a modificar
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public boolean getGenero() {
		return genero;
	}
	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	//@Override 
	//public String toString()
	//{
		//return "Perro [nombre=" + this.getNombre() + ", edad= " + this.getEdad() + ", raza= " + raza + ""
	 //+}
	
	}

