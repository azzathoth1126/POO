public class Unam {

	public static void main (String [] args) {
		String cadena1="UNAM";
		String cadena2="UNAM";
		String cadena3=new String("UNAM");
		System.out.println (cadena1.equals(cadena2));
		System.out.println (cadena3 == cadena1);
		System.out.println (cadena1.equals(cadena3));
	}
}
