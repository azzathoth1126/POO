/**
 * Crea objetos apartir de lo siguiente:
 * Crea cuantas cadenas de texto tecles en la terminal (al ejecutar el programa)
 * Nombra cada objeto con la cadena de texto correspondiente
 * */
class Cadena {
	Cadena(String s) { 
	System.out.println("Creando el constructor: "+s);
	}
}

public class SimpleConstructor2 {
	public static void main(String[ ] args) {
	for(int i=0;i<args.length;i++) {
		new Cadena(args[i]);
		}	
	}
}
