package metodos;
import metodos.Base;
public class HeredaMismaClase extends Base {
	public HeredaMismaClase (){
		System.out.println(" ");
        	System.out.println("El atributo amigable en la clase Hereda es:" + atributoFriend);
        	System.out.println("El atributo protegido en la clase Hereda es:" + atributoProt);
        	System.out.println("El atributo publico en la clase Hereda es:"	+ atributoPub);
		//System.out.println("El atributo privado en la clase Hereda es:" + atributoPriv);
	}
	
	public static void main(String args[]){
		HeredaMismaClase visibilidad=new HeredaMismaClase();			
		}
}// Fin de la clase

/**
 * Formas de compilar el programa
 * 1:
 * 	javac HeredaMismaClase.java
 * 	mkdir metodos
 * 	mv HeredaMismaClase.class metodos/
 * 	java metodos.Base
 * 
 * 2:
 * 	javac -d . Base.java  
 * 		javac -d hola/que/haces HeredaMismaClase.java
 * 	java metodos.HeredaMismaClase
 */

