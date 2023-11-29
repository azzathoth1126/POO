import java.io.*;
public class  LeeTeclado {
	public String leeCadena(){
		String cadena="";
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			cadena = in.readLine();
		}catch(IOException ioe){
			System.out.println("Error al leer");
			ioe.printStackTrace();
		}
		return cadena;
	}

	public static void main(String[] args) {
		String cadena="";
		LeeTeclado lt = new LeeTeclado();
		while(!cadena.equals("salir")){
			System.out.println("Escribe algo:\t");
			cadena=lt.leeCadena();
			System.out.println("Lo que escribiste :\t "+cadena);
		}
	}
}
