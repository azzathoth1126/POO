public class PruebaOperadoresLogicosTryCatch{
    boolean b;
    public void probarAND(int z, int x, int a){
	System.out.println("--------------------------------");
	System.out.println("Probando el operador booleano AND");
	System.out.println("El valor z es:"+z);
	System.out.println("El valor x es:"+x);
	System.out.println("El valor a es:"+a);
	if( x>z && a>z)
	     System.out.println("El valor z es menor a x y a");
	else
	    if( x<z && a>z)
	         System.out.println("El valor z es mayor a x pero menor que a");
	    else
		if( x>z && a<z)
	     	    System.out.println("El valor z es menor a x pero mayor que a");
	        else
		    if( x<z && a<z)
	     		System.out.println("El valor z es mayor a x y a");
	            else{
	    		 System.out.println("El valor z es igual a x y a");
			 b=true;
		    }
	
     }
     public void probarOR(int z, int x, int a){
	System.out.println("--------------------------------");
	System.out.println("Probando el operador booleano OR");
	if( z>x || z>a)
	   System.out.println("Sabemos que z es mayor al menos de un valor");
	else
	   System.out.println("z es menor en ambos valores o iguales");
     }
     public void probarNOT(){
	System.out.println("--------------------------------");
	System.out.println("Probando el operador booleano NOT");
	if(!b)
	   System.out.println("Son diferentes los valores de z,x y a");
	else
	   System.out.println("Se comprueba que los valores de z, x y a son iguales");
     }
     public static void main(String args[]){
	try{
	    int b=Integer.parseInt(args[0]);
	    int c=Integer.parseInt(args[1]);
	    int d=Integer.parseInt(args[2]);
	    PruebaOperadoresLogicosTryCatch pol = new PruebaOperadoresLogicosTryCatch();
	    pol.probarAND(b,c,d);
	    pol.probarOR(b,c,d);
	    pol.probarNOT();
	}catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Forma de uso: java PruebaOperadoresLogicosTryCatch int int int ");
        }
     }
}	

