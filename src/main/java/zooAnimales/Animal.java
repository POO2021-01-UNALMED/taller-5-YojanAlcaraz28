package zooAnimales;

import java.util.ArrayList;

import gestion.*;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;

	static {
		totalAnimales = 0;
	}

	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}

	public Animal() {

	}

	// Getters y setters:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZonas() {
		return zona;
	}

	public void setZonas(Zona zonas) {
		this.zona = zonas;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	// Métodos

	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.getListado().size()+
				"Aves: " + Ave.getListado().size()+
				"Reptiles: " + Reptil.getListado().size()+
				"Peces: " + Pez.getListado().size()+
				"Anfibios: "+ Anfibio.getListado().size();
	}

	public String toString() {
		String resultado = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + "y mi genero es "
				+ genero;
		if (zona != null){
			resultado += ", la zona en la que me ubico es " + zona + ", en el " + Zona.getZoo();
		}
		return resultado;
	}

	public String movimiento() {
		return "desplazarse";
	}

}
