package gestion;

import java.util.ArrayList;

import zooAnimales.*;

public class Zona {
	private String nombre;
	private static Zoologico zoo;
	private static ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre,Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona(){
		super();
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public static Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}

	public void agregarAnimales(Animal animal) {
		animales.add(animal);

	}
	
	public static int cantidadAnimales() {
		return animales.size(); ////Necesito los de la zona. tama?o lista animales.
	}

}
