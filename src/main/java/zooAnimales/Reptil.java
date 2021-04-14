package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil() {
		
	}

	// Getters y setters.
	
	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	//Metodos.
	
	public int cantidadReptiles() {
		return listado.size();
	}

	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana1 = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
		return iguana1;
		
		
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente1 = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes++;
		return serpiente1;
		
		
	}
}
