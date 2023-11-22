class DemasiadoCalor extends JugarBeisbolException{

	public DemasiadoCalor(String mensaje){
	super(mensaje);
	}
	void causa(){
	    System.out.println("El partido no puede empezar debido a que la temperatura supera los 40 grados");
	}
}
