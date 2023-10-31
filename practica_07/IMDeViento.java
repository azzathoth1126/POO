public class IMDeViento extends InstrumentoMusical{
    void play(){
	System.out.println("Toca el IM de Viento");
    }
    String soy(){
	return "Soy un IM de Viento";
    }
    void afina(){
	System.out.println("Afina un IM de Viento");
    }
}

// Comentamos el metodo soy para ver que error marca
 /*
  * ./IMDeViento.java:1: error: IMDeViento is not abstract and does not override abstract method afina() in InstrumentoMusical
public class IMDeViento extends InstrumentoMusical{
       ^
1 error
*/

//Error que genera por comentar un metodo heredado que era abstracto
