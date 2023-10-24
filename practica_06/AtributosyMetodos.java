class AtributosyMetodos{
	//atributo
	int a; //Global inicializada en 0 o null
	//metodos
	
	void noHagoNada(){
	}

	void imprimoHola(){
		System.out.println("Hola");
	}

	public static void main(String args[]){
		AtributosyMetodos am = new AtributosyMetodos();
		am.noHagoNada();
		am.imprimoHola();
		System.out.println("a = "+ am.a); // Imprime el valor de a
	}
	}//fin clase
