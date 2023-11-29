import java.io.*;
public class Archivo{
    public static void main(String args[]){
	try{
	    File miArchivo = new File("./nombres");
	    FileInputStream fis = new FileInputStream(miArchivo);	
	    BufferedReader br = new BufferedReader(new InputStreamReader(fis));  
	    String linea;
	    while((linea=br.readLine())!=null)
		System.out.println("El usuario es:"+linea);
	    br.close();
	    fis.close();
	}catch(IOException ioe){
	    System.out.println("Estoy en la excepcion"+ioe);
	}
    }
}
