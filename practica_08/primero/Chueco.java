public class Chueco{
    public static void main(String args[]){ 
	String s = new String("Programacion Avanzada y Metodos Numericos");
	StringBuffer sb = new StringBuffer(s.length());
	System.out.println("La cadena Original :"+s);
	sb.append(s);
	sb.reverse();
	System.out.println("La cadena invertida es: "+sb);
    }
}
