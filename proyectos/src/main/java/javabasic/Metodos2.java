package javabasic;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {

	static String heredar="Mensaje de texto";
	

	protected static List<String> listaDeNombres(){
		List<String> listaNombres = new ArrayList<>();
		
		listaNombres.add("Sergio");
		listaNombres.add("Sergio");
		listaNombres.add("ivan");
		listaNombres.add("Ramones");
		listaNombres.add("vale");
		return listaNombres;
		
	}
	protected  static List<Integer> ListaNumeros(){
		List <Integer> listaNumeros =new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(1);
		listaNumeros.add(20);
		listaNumeros.add(6);
		listaNumeros.add(78);
		listaNumeros.add(12);
		return listaNumeros;
	}
	

}
