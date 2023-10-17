class Rock {
	Rock(int i) { 
	System.out.println("Creando el constructor n˙mero: "+i);
	}
}

public class SimpleConstructor {
	public static void main(String[ ] args) {
	for(int i=0;i<10;i++)
	new Rock(i);
	}
}
