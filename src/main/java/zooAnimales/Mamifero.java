package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public static int mamiferos;

	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		//this.setPelaje(pelaje);
		this.pelaje = pelaje;
		this.patas = patas;
		//this.setPatas(patas);
		listado.add(this);
	}

	public Mamifero() {
		mamiferos++;

	}
	
	public static int cantidadMamiferos() {
		return listado.size() + mamiferos;
	}

	// Getters y setters.

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo1 = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return caballo1;

	}

	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon1 = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
		return leon1;
	}

	

}
