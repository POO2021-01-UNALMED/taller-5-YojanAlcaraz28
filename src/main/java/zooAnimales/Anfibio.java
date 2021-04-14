package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	/*public Anfibio(ArrayList<Anfibio> listado,int ranas,int salamandras,String colorPiel,boolean venenoso,int totalAnimales,String nombre,int edad,String habitat,String genero,ArrayList<Zona> zonas) {
		super(totalAnimales,nombre,edad,habitat,genero,zonas);
		this.listado = listado;
		this.ranas = ranas;
		this.salamandras = salamandras;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}*/
	
	public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel, boolean venenoso) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.setColorPiel(colorPiel);
		this.setVenenoso(venenoso);
		listado.add(this);
	}
	
	public Anfibio() {
	
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
		
	}

	// Getters y setters.
	
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	
	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana1 = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		return rana1;
		
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra1 = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",true);
		ranas++;
		return salamandra1;
	
	}

}
