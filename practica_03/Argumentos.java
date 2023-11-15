public class Argumentos {
    public static void main(String args[]){ 
	if(args.length < 3){ 
	    System.out.println("Hola, tu nombre es :"+args[0]);
	    System.out.println(" y apellido: "+args[1]);
	}
	else 
	    System.out.println("Forma de uso: java Argumentos valor1 valor2"); 
    }
}