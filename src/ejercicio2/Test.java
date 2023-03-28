package ejercicio2;

public class Test {

	public static void main(String[] args) {
		Computadora c = new Computadora();
		c.agregarArchivo( new ArchivoTexto("Lista de compras",0.0,"",true,"Windows-2032") );
		c.agregarArchivo( new ArchivoPDF("Libro de Java",0.0,"",true) );
		c.agregarArchivo( new ArchivoTexto("Machete de JS", 0, "C:/", false, "UTF-8") );
		c.agregarArchivo( new ArchivoPDF("Libro de Java",0.0,"",true,"123456") );
		
		c.mostrarArchivos();
	}

}
