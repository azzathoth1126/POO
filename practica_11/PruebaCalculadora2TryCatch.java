public class PruebaCalculadora2TryCatch{

   public static void main(String args[]){
 	try{
	    int a = Integer.parseInt(args[0]);
	    int b = Integer.parseInt(args[1]);
	    char c = args[2].charAt(0);
	    Calculadora2 casio = new Calculadora2();
	    System.out.println("El resultado es: "+casio.realizarOperacion(a,b,c));
        }catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Forma de uso: java PruebaCalculadora2TryCatch \"entero entero 'operador' (+,-,*,/) \" ");
	}catch(NumberFormatException nfe){
            System.out.println("El argumento1 y/o Argumento2 debe ser un numero");
	}catch(ArithmeticException div){
            System.out.println("No se puede dividir entre cero");
	}
   }
}
