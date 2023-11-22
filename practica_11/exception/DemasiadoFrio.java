class DemasiadoFrio extends JugarBeisbolException{
	public DemasiadoFrio(String mensaje){
	super(mensaje);
	}
	
	void causa(){
	System.out.println("El partido no puede empezar debido a que la temperatura es menor a los 0 grados");
	}
}
