import java.util.*;
public class PruebaST{
   public static void main(String []args){
	String mensajeSecreto="aterceS esarF anu se atsE";
	StringBuffer sb= new StringBuffer();
	sb.append(mensajeSecreto);
	sb.reverse();
	String cadena="";
	cadena=cadena+sb;
	StringTokenizer filtro = new StringTokenizer(cadena);
	try {
	   while(filtro.hasMoreElements())
	   	System.out.println(filtro.nextToken());
	} catch(NoSuchElementException e) { }
  }//main
}//clase
