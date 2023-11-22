class Lloviendo extends JugarBeisbolException{
	public Lloviendo(String mensaje){
	super(mensaje);
	}
	
	void causa(){
	System.out.println("El partido no puede empezar debido a que esta lloviendo");
	}
}
