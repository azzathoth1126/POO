public class PruebaOperadoresBits{

    public  static void main(String []args){

        int bitsOrigen=6;                                                
	    int bandera=4;
        int respuesta=(bitsOrigen & bandera);

	    System.out.println ("6 & 4 =" +respuesta); //AND bit
        respuesta=(bitsOrigen | bandera);
	    System.out.println ("6 | 4 =" +respuesta); //OR bit
        respuesta=(bitsOrigen ^ bandera);
	    System.out.println ("6 ^ 4 =" +respuesta); //XOR bit
        int ValorOriginal=12;
	    respuesta=(~ValorOriginal);
	    System.out.println (respuesta); //Inversor 

	} //main
}//Fin de la Clase