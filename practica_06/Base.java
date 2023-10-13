package metodos;
 
public class Base {
	private int atributoPriv;
	        int atributoFriend;
	protected int atributoProt;
	public int atributoPub;

 	public Base(){
		atributoPriv=34;
		atributoPub=80;
		atributoFriend=10;
		atributoProt=5;
		System.out.println("El atributo amigable en la clase base  es:" +atributoFriend);
		System.out.println("El atributo protegido en la clase base es:" +atributoProt);
		System.out.println("El atributo publico en la clase base es:" +atributoPub);
		System.out.println("El atributo privado en la clase base es:" +atributoPriv);
	}

    public static void main(String args[]){
		Base mibase = new Base();
    }
}