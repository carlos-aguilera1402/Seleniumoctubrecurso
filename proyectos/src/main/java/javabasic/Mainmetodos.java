package javabasic;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class Mainmetodos {

	public static void main(String[] args) {
		Metodos nombreObjetos= new Metodos();
		Metodos nombreObjetos2= new Metodos(9,3);
		Metodos2 objeto=new Metodos2();
	
		
	System.out.println(nombreObjetos.sumatoria());
	System.out.println(nombreObjetos2.sumatoria());
	nombreObjetos.mostrarmensaje();
	String elementoGuardado = nombreObjetos.mostrarNombre("SERGIO");
	
	System.out.println(elementoGuardado);
	Metodos.prueba();
	
	List<String> listaNombres = Metodos2.listaDeNombres();
	List<Integer> listaNumeros = Metodos2.ListaNumeros();

	
	for(String nombre : listaNombres){
		System.out.println(nombre);

		}
	for (int indice=0; indice <listaNombres.size(); indice++) {
		System.out.println(listaNombres.get(indice));
		}
	System.out.println("For con indicez");	
	for (int numero : listaNumeros) {
		System.out.println(numero);
		}
	List<String> nombresSinElementosDuplicados =listaNombres.stream().distinct().collect(Collectors.toList());

	Collections.sort(nombresSinElementosDuplicados);	
	System.out.println(nombresSinElementosDuplicados);
	Collections.sort(nombresSinElementosDuplicados,Collections.reverseOrder());	
	System.out.println(nombresSinElementosDuplicados);

	System.out.println(Collections.max(listaNumeros));
	System.out.println(Collections.min(listaNumeros));
	Collections.sort(listaNumeros);
	System.out.println(listaNumeros);
	Collections.sort(listaNumeros,Collections.reverseOrder());	
	System.out.println(listaNumeros);
	
	Object last=null;
	int numCount =0;
	Iterator<Integer> i = listaNumeros.iterator();
	while (i.hasNext()) {
		Object temp = i.next();
		if(temp.equals(last)) {
			i.remove();
			numCount++;
			}else {
				last = temp;
				}
		}
	System.out.println(numCount);
	System.out.println(listaNumeros);
	}

	
}

