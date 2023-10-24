package metodos;
 
public class Base {
	private int atributoPriv;
	        int atributoFriend;
	protected int atributoProt;
	public int atributoPub;

 	public Base(){
		atributoPriv=34;
		atributoPub=80;
		atributoFriend=10;
		atributoProt=5;
		
		System.out.println("El atributo amigable en la clase base  es:" +atributoFriend);
		System.out.println("El atributo protegido en la clase base es:" +atributoProt);
		System.out.println("El atributo publico en la clase base es:" +atributoPub);
		System.out.println("El atributo privado en la clase base es:" +atributoPriv);
	}

    public static void main(String args[]){
		Base mibase = new Base();
    }
}

/**
 * Formas de compilar el programa
 * 1:
 * 	javac Base.java
 * 	mkdir metodos
 * 	mv Base.class metodos/
 * 	java metodos.Base
 * 
 * 2:
 * 	javac -d . Base.java  
 * 		javac -d hola/que/haces. Base.java
 * 	java metodos.Base
 */