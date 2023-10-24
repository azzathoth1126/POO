public class PrueCasIns {	
	public static void main (String [] args){
		Object arreglo [] = new Object [6];
		
		Gato donGato = new Gato ();
		Perro Scooby = new Perro ();
		Gato Garfield = new Gato ();
		Perro huesos = new Perro ();
		Gato tommy = new Gato ();
		Perro laika = new Perro ();
	
		arreglo[0]=donGato;
		arreglo[1]=Scooby;
		arreglo[2]=Garfield;
		arreglo[3]=huesos;
		arreglo[4]=tommy;
		arreglo[5]=laika;
		
		for ( int i=0; i < arreglo.length; i++){
			if (arreglo[i] instanceof Perro)
				((Perro)arreglo[i]).ladra();
		else
			((Gato)arreglo[i]).maulla();
		}
	} //Fin del main
} //Fin de la clase


/*
 * Esta clase usa las clases perro hato y animales
 * */
