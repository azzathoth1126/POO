public class Palindromo{
    public static void main(String args[]){ 
	String s="";
	for(int k=0;k<args.length;k++)
	    s= s+args[k];
	StringBuffer sb = new StringBuffer(s.length());
	System.out.println("La capacidad de StringBuffer es :"+sb.capacity());
	System.out.println("La cadena Original :"+s);
	sb.append(s);
	sb.reverse();
	System.out.println("La cadena invertida es: "+sb);
	if(s.equals(sb.toString())){
	    System.out.println("Tu cadena es un palindromo");
	    System.out.println(s+"="+sb);
	    System.out.println("La capacidad de StringBuffer es :"+sb.capacity());
	}
	else{
	    System.out.println("Tu cadena no es un palindromo");
	    System.out.println("Aqui se aumenta el espacio reservado para StringBuffer");
	    sb.append("+ aumentando el espacio para StringBuffer");
	    System.out.println("Ahora la capacidad de StringBuffer es :"+sb.capacity());
	    System.out.println("Ahora la cadena es: "+sb);
	}
    }
}
