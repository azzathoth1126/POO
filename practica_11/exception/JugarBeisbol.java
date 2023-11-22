import java.util.*;

public class JugarBeisbol{

	private int temperatura;
	private boolean lloviendo;

	public JugarBeisbol(int temperatura,boolean lloviendo){
	    this.temperatura=temperatura;
	    this.lloviendo=lloviendo;
	}

	public void verificarCondiciones()throws DemasiadoCalor{
		if(temperatura>40)
			throw( new DemasiadoCalor("Originada desde metodo verificarCalor();") );
		else{
			try{
			    verificarFrio();
			}catch(DemasiadoFrio df){
			    df.causa();
			}
			finally{
			    imprime("El flujo se encuentra en el metodo verificarCondiciones");
			}
		}
	}

	public void verificarFrio()throws DemasiadoFrio{
		if(temperatura < 0)
			throw( new DemasiadoFrio("Originada desde metodo verificarFrio();") );
		else{
		    try{
			verificarLluvia();
	  	    }catch(Lloviendo ll){
			ll.causa();
			}
			finally{
			    imprime("El flujo se encuentra en el metodo verificarFrio");
			}
		}
	}

	public void verificarLluvia()throws Lloviendo{
		if(lloviendo)
			throw( new Lloviendo("Originada desde metodo verificarLluvia();") );
		else
			empezarPartido();
	}

	public void empezarPartido(){
	Date hoy = new Date();
	imprime("El partido comenzara con las condiciones meteoroloicas satisfactorias");
	imprime("Fecha de inicio del partido = "+hoy);
	}

	static void imprime(String var){
	System.out.println(var);
	}

}
