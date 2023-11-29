import java.io.*;

public class Redirecciona{
	public static void main(String [] args){
		try{
			int ultimo = Integer.parseInt(args[0]); 
			PrintStream salida = new PrintStream(new BufferedOutputStream( new FileOutputStream("prueba.txt")));
			System.setOut(salida);
			int [] conteo = new int[50];
			for (int i=0;i<ultimo;i++){
				conteo[i]=i;
				System.out.println(conteo[i]);
			}
			salida.close();
		}catch(Exception e){
			System.err.println("Excepcion");
			e.printStackTrace();
		}
	}
}
