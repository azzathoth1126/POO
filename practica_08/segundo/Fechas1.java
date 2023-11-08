import java.util.*;
public class Fechas1{
   public static void main(String [] args){
        Date ahora= new Date();
	long InicioTiempo=ahora.getTime(); //Cronometro start	
	for (long i=0; i< 1000000;i++)
	    ahora = new Date(); //cronometro stop
	long FinTiempo=ahora.getTime();
       System.out.println("El tiempo transcurrido en el for en milisegundos "+(FinTiempo-InicioTiempo));
	Date fechaInicio= new Date(99,8,4);
	Date fechaFin= new Date(116,4,4);
        System.out.println("La diferencia entre: "+fechaInicio+" y " +fechaFin+" es "+ (Math.abs(fechaFin.getTime()-fechaInicio.getTime()))/86400000+" dias.");
}

 }
