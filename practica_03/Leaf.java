//Leaf.java
//ejemplo de la palabra reservada this
public class Leaf {
    int i=17;

    Leaf incremento(){
        i++;
        return this;
        /**Esto permite encadenar llamadas a métodos en la misma instancia, 
         * lo que a menudo se conoce como "chaining" en programación.
         * MiClase objeto = new MiClase();
         * objeto.incremento().incremento().incremento();*/
        }

    void print() {
        System.out.println("i= " +i );
        }

    public static void main( String[] args ) {
        Leaf x = new Leaf();
        x.incremento().incremento().incremento().print();
        }

}//fin clase