import java.io.*;

public class Escribe {

public static void main(String args[]) {
    String usuario="pumas:unam";
    try{
        File archivo= new File("usuarios.txt");
        FileOutputStream dis=new FileOutputStream(archivo, true);
        PrintStream escribe=new PrintStream(dis);
        escribe.println(usuario); 
        dis.close();
        escribe.close();
    }catch(Exception e) {
	System.out.println("Ocurrio un error");
    }
}

}
