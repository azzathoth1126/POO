interface Monstruo{
    void travieso();
}
interface MonstruoPeligroso extends Monstruo{
    void destruye();
}
interface Letal{
    void mata();
}
interface Vampiro extends MonstruoPeligroso{
    void chupaSangre();
}
//Clases que implementan interfaces, son clases friendly
class Godzilla implements Letal, Monstruo{
    public void travieso(){
	System.out.println("Estoy haciendo travesuras");
    }
    public void mata(){
	System.out.println("Estoy matando");
    }
}
class Ingeniero implements Vampiro{
    public void chupaSangre(){
	System.out.println("Estoy chupando");
    }
    public void destruye(){
	System.out.println("Estoy destruyendo");
    }
    public void travieso(){
	System.out.println("Hago travesuras");
    }
}

public class Monstruos{
    public static void main(String args[]){ 
	Godzilla godzuki = new Godzilla();
	Ingeniero ing = new Ingeniero();
	System.out.println(" ");
	System.out.println("godzuki se encuentra ");
	godzuki.travieso();
	godzuki.mata();
	System.out.println(" ");
	System.out.println("ing se encuentra ");
	ing.chupaSangre();
	ing.destruye();
	ing.travieso();
    }
}
