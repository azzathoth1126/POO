class Rock {
	Rock(int i) { 
	System.out.println("Creando el constructor n˙mero: "+i);
	}
}
/**
 * Crea diez objeto pero no hay forma de acceder a ellos
 * 
 * No podemos acceder a ellos porque no sabemos sus nombres
 */
public class SimpleConstructor {
	public static void main(String[ ] args) {
	for(int i=0;i<10;i++)
	new Rock(i);
	}
}
