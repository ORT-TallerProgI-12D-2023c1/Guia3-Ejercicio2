package ejercicio2;

import java.util.ArrayList;

public class Computadora {
	private ArrayList<Archivo> archivos;
	
	public Computadora() {
		this.archivos = new ArrayList<>();
	}
	
	public void agregarArchivo(Archivo a) {
		this.archivos.add(a);
	}
	
	public void mostrarArchivos() {
		for (Archivo archivo : archivos) {
			System.out.println(archivo);
		}		
	}
	
}
