public class Argumentos {
    public static void main(String args[]){ 
	if(args.length < 3){ 
		try{
			System.out.println("Hola, tu nombre es :"+args[0]);
			System.out.println(" y apellido: "+args[1]);
		}catch(ArrayIndexOutOfBoundsException aioobe ){
			System.out.println("Te lo dije, pon atención");
		}
		System.out.println("Se acabo el programa");
	}
	else 
	    System.out.println("Forma de uso: java Argumentos valor1 valor2"); 
    }
}
