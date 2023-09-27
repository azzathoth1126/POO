public class PruebaCasting {

	private static byte elByte=0xa;
	private static char elChar=0x61;
    private static short elShort=0x7fff;
    private static int elEntero=123;
    private static long elLong=100L;
    private static float elFlotante=1.3654e-40F;
    private static double elDoble=47e47D;
        
    private static boolean booleano;
        
	public static void main(String args[]){
        
        System.out.println("\nTipo de Dato || tamaño || valor\n");
        System.out.println("Byte            8  bits "+elByte);
        System.out.println("Character       16 bits "+elChar);
        System.out.println("Short           16 bits "+elShort);
        System.out.println("Integer         32 bits "+elEntero);
        System.out.println("Long            64 bits "+elLong);
        System.out.println("Float           64 bits "+elFlotante);
        System.out.println("Double          64 bits "+elDoble);
        System.out.println("Boolean         ninguno "+booleano);
        
        elByte=0x1;
	    elChar='c';
        elShort=7;
        elEntero=123;
        elLong=100L;
        elFlotante=415.54F;
        elDoble=65.654564654;
        
        elFlotante=(float)elDoble;
        elLong=(long)elFlotante;
        elEntero=(int)elLong;
        elShort=(short)elEntero;
        elChar=(char)elShort;
        elByte=(byte)elChar;
        
        System.out.println("\nDespues del Casting");
   	    System.out.println("\nTipo de Dato || tamaño || valor\n");
   	    System.out.println("Byte            8  bits "+elByte);
        System.out.println("Character       16 bits "+elChar);
        System.out.println("Short           16 bits "+elShort);
        System.out.println("Integer         32 bits "+elEntero);
        System.out.println("Long            64 bits "+elLong);
        System.out.println("Float           64 bits "+elFlotante);
        System.out.println("Double          64 bits "+elDoble);
   	
	}
}