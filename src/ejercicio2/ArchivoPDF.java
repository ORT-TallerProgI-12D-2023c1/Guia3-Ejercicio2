package ejercicio2;

public class ArchivoPDF extends Archivo {
	private String clave;

	public ArchivoPDF(String nombre, double peso, String localizacion, boolean abierto, String clave) {
		super(nombre, peso, localizacion, abierto);
		this.clave = clave;
	}
	
	public ArchivoPDF(String nombre, double peso, String localizacion, boolean abierto) {
		this(nombre, peso, localizacion, abierto, null);
	}
	
	
}
