package zooAnimales;

import gestion.*;

public class ejecutar {

	public static void main(String[] args) {
		Anfibio an1 = new Anfibio();
		Anfibio an2 = new Anfibio("rana", 5, "pradera", "F","verde", false);
		/*System.out.println(an1.getNombre());
		System.out.println(an2.getNombre());
		Mamifero cab1 = new Mamifero("vaca",6,"pradera","F",false,2);
		cab1.crearCaballo("Lola", 6, "F");
		System.out.println(cab1.getNombre());
		Zoologico zoo1 = new Zoologico();
		Zona zona2 = new Zona("salvaje", zoo1);
		System.out.println(zona2.getNombre());*/
		System.out.println(an2.toString());
		
		
		

	}

}
