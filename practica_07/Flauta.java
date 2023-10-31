public final class Flauta extends IMDeViento{
     String soy(){
	return "Soy un clarin, parecido a la flauta";
     }
 
     public static void main(String args[]){ 
	Flauta f = new Flauta();
	System.out.println(f.soy());
	f.afina();
	f.play();
    }
}
