package gestion;
import zooAnimales.*;

import java.util.ArrayList;

import zooAnimales.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zona = new ArrayList<Zona>();;

	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;

	}

	public Zoologico() {

	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}

	public void setZona(ArrayList<Zona> zonas) {
		this.zona = zonas;
	}

	public int cantidadTotalAnimales() {
		return Zona.cantidadAnimales();
	}

	public void agregarZonas(Zona zona) {
		this.zona.add(zona);
		

	}

}
