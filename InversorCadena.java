public class InversorCadena{
    public static void main(String args[]){ 
	String s = new String("Programacion Avanzada y Metodos Numericos");
	int variable=s.length();
	char arregloc[] = new char[variable];
    System.out.println("La cadena Original: "+s);
	
    for(int i=1; i<=variable; i++){
            arregloc[i-1]=s.charAt(variable-i); //Como va de 1 a 30 rompe el programa por eso el arregloc[i-1] en vez de arregloc[i]
		String resultado = new String(arregloc); 	
	}
    String resultado = new String(arregloc); 
    System.out.println("La cadena invertida es: "+resultado);
    }
}
