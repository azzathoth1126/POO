class Sobrecarga{
	int atributo;
	
	void metodo(){
		 System.out.println("No recibo nada,el valor de atributo es :"+atributo);
		 //System.out.println("No recibo nada,el valor de atributo es :"+this.atributo);
	}
	
	void metodo(int valor){
		System.out.println("Recibo un entero =" + valor);
	}

	/*void metodo(String dato){
		System.out.println("Recibo una cadena =" + dato);
	}*/ //Metodo que recibe un parametro cadena

	void metodo(int x, int y){
		System.out.println("Recibo dos enteros x="+x+" y="+y);		
	}
	
	Sobrecarga(){ //Metodo constructor
		System.out.println("Constructor default");
	}

	Sobrecarga(int valor){ //Metodo constructor
		//this.atributo=valor; //Como tienen el mismo nombre podemos quitar el this
		atributo=valor;
		System.out.println("Constructor Sobrecargado");
	}

	public static void main(String args[]){
		Sobrecarga s=new Sobrecarga();
		s.metodo();
		s.metodo(9);
		s.metodo(10,9);
		Sobrecarga s1=new Sobrecarga(2);
		s1.metodo();
		s1.metodo(8);
		s1.metodo(0,3);
	}
}//Fin del clase

//Cuando hay dos metodos que reciber distintos parametros el programa sabe cual usar dependiendo del parametro
