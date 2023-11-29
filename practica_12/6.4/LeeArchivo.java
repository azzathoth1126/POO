import java.io.*;
public class LeeArchivo{
    public static void main(String args[]){
        try{
            File miArchivo = new File(args[0]);
            FileInputStream fis = new FileInputStream(miArchivo);
            DataInputStream dis = new DataInputStream(fis);
            String linea;
            while((linea=dis.readLine())!=null)
                System.out.println("La cadena es:"+linea);

		dis.close();
		fis.close();

        }catch(IOException ioe){
            System.out.println("Estoy en la excepcion"+ioe);
        }
    }
}
