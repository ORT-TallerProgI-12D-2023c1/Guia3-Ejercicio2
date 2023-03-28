package ejercicio2;

public abstract class Archivo {
	String nombre; 
	double peso; 
	String localizacion; 
	boolean abierto;
	
	public Archivo(String nombre, double peso, String localizacion, boolean abierto) {
		this.nombre = nombre;
		this.peso = peso;
		this.localizacion = localizacion;
		this.abierto = abierto;
	}	
	
	public Archivo(String nombre, double peso, String localizacion) {
		this(nombre,peso,localizacion,false);
	}	
	
	public Archivo(String nombre, String localizacion) {
		this(nombre,0,localizacion);
	}	
}
