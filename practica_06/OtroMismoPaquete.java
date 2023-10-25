import metodos.Base;
public class OtroMismoPaquete {
	public OtroMismoPaquete(){
	Base MiBase = new Base();
        //System.out.println("el atributo protegido en la clase Otro.. es: " +MiBase.atributoProt);
        System.out.println("el atributo publico en la clase Otro.. es: " +MiBase.atributoPub); 
        //System.out.println("el atributo friendly en la clase Otro.. es: " +MiBase.atributoFriend);
        //System.out.println("el atributo privado en la clase Otro.. es: " +MiBase.atributoPriv);
 	}
	
	public static void main(String args[]){
		OtroMismoPaquete visible=new OtroMismoPaquete();
	}
}//Fin de la clase

//Sin comentar las tres lineas marcara tres errores por
//	No esta en la misma clase
//	Por herencia
//	Por ser privado (Cuestionable)

