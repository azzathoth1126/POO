import java.util.Hashtable;
public class PruebaHash{
    public static void main(String []args){
        Hashtable ht = new Hashtable();
        Gato demostenes=new Gato();
        Gato cucho =new Gato();
        Gato panza=new Gato();
	System.out.println("Esta vacio el Hash Table:"+ht.isEmpty());
	System.out.println("El tamaño del Hash Table:"+ht.size());
	System.out.println("Registrando los alumnos");
        ht.put(demostenes,"Gerardo");
        ht.put(cucho,"Saul");
        ht.put(panza,"Juan");
        ht.put("MiGato","Un nuevo Gato");
	System.out.println("Esta vacio el Hash Table:"+ht.isEmpty());
	System.out.println("El tama&o del Hash Table:"+ht.size());
	System.out.println("El cuarto valor del Hash Table es:"+ht.get("MiGato"));
    }
}
