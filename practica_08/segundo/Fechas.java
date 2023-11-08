import java.util.Date;

public class Fechas{
   public static void main(String [] args){
       //fecha del sistema
       Date hoy= new Date();
       System.out.println("La fecha de hoy es "+hoy);
       System.out.println("El dia de la semana es "+hoy.getDay());
       System.out.println("La hora de este dia es: "+hoy.getHours()+" "+hoy.getMinutes());
       System.out.println("El mes de este dia es: "+hoy.getMonth());
       hoy.setDate(30+1); 
       System.out.println("La fecha de hoy es "+hoy);
       System.out.println("El dia de la semana es "+hoy.getDay());
       System.out.println("La hora de este dia es: "+hoy.getHours()+" "+hoy.getMinutes());
       System.out.println("El mes de este dia es: "+hoy.getMonth());
       Date fechaFut=new Date(126,8,12);
       System.out.println("Una fecha futura es: " +fechaFut);   
    }

 }
 
// javac Fechas.java -Xlint
