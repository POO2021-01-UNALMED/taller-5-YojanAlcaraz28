package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.setColorPlumas(colorPlumas);
	} 
	
	public Ave() {
		
	}

	//Getters y setters.
	
	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	

	// Métodos.
	
	public int cantidadAves() {
		return listado.size();
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon1 = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones++;
		return halcon1;
		
	}

	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila1 = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
		return aguila1;
		
	}
}
