public class PruebaNativos{
    
    public static boolean booleano;
    private static short elShort;
    private static int elEntero;
    private static float elFlotante;
    private static long elLong;
    private static double elDoble;
    private static String cadena;

    public static void main (String [] args ) {
        
        /** int hola = 5; 
            solo las variables globales o de inicializacion, si no se inicializan 
                con algun valor el compilador les da un valor por defecto */
        
        System.out.println(booleano);
        System.out.println(elShort);
        System.out.println(elEntero);
        //System.out.println(hola);
        System.out.println(elFlotante);
        System.out.println(elLong);
        System.out.println(elDoble);
        System.out.println(cadena);
    
    }
}