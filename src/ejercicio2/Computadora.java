package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Computadora {
	private ArrayList<Archivo> archivos;
	
	public Computadora() {
		this.archivos = new ArrayList<>();
	}
	
	public void agregarArchivo(Archivo a) {
		this.archivos.add(a);
		Collections.shuffle(archivos);
	}
	
	public void mostrarArchivos() {
		for (Archivo archivo : archivos) {
			System.out.println(archivo);
		}		
	}
	
	public void cerrarTodos() {
		for (Archivo archivo : archivos) {
			if( archivo.isAbierto() ) {
				archivo.cerrar();
			}
		}
	}
	
	public int cantArchivosDeTexto() {
		int cont = 0;
		for (Archivo archivo : archivos) {
			if( archivo instanceof ArchivoTexto) {
				cont++;
			}
		}
		return cont;
	}
	
	public void cifrarArchivos() {
		// FORMA 1
		/*for (Archivo archivo : archivos) {
			if(archivo instanceof ArchivoTexto && ((ArchivoTexto) archivo).isUTF8()) {
				((ArchivoTexto) archivo).cifrar();
			}
		}*/
		
		// FORMA 2
		for (Archivo archivo : archivos) {
			if(archivo instanceof ArchivoTexto) {
				ArchivoTexto archTexto = (ArchivoTexto) archivo;
				if (archTexto.isUTF8()) {
					archTexto.cifrar();
				}			
			}
		}
	}
	
}
