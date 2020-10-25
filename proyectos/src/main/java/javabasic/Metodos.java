package javabasic;

public class Metodos {
	int numero1, numero2;
	public Metodos(int numero1, int numero2) {
		this.numero1=numero1;
		this.numero2=numero2;
	}
	
	public Metodos() {
	}
	

	public static void main(String[] args) {
		Metodos nombreObjetos= new Metodos();
		Metodos nombreObjetos2= new Metodos(9,3);
		
	System.out.println(nombreObjetos.sumatoria());
	System.out.println(nombreObjetos2.sumatoria());
	nombreObjetos.mostrarmensaje();
	String elementoGuardado = nombreObjetos.mostrarNombre("SERGIO");
	
	System.out.println(elementoGuardado);
	Metodos.prueba();
	}

public void mostrarmensaje() {
	System.out.println("Hola mundo");
}

public int sumatoria() 
{
	return numero1 + numero2;
}
public String mostrarNombre(String nombre) {
	System.out.println(nombre);
	return nombre;
}

public static void prueba () {
	System.out.println("Metodo estatico");
}

}
