package ejercicio2;

public class ArchivoTexto extends Archivo {
	
	private String codificacion;

	public ArchivoTexto(String nombre, double peso, String localizacion, boolean abierto, String codificacion) {
		super(nombre, peso, localizacion, abierto);
		this.codificacion = codificacion;
	}

	public void cifrar() {
		System.out.println("Archivo cifrado");
	}
	
	
	
	
}
