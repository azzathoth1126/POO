import java.io.*;
public class PruebaFile{
    public static void main (String [] args){
  	  File f=new File("nombres");
    	System.out.println(f.toString()+"puede leerse?..."+f.canRead());
  	  System.out.println(f.toString()+"puede escribirse?..."+f.canWrite());
  	  System.out.println("Es directorio?..."+f.isDirectory());
  	  System.out.println("Es Archivo?..."+f.isFile());
  	  System.out.println("Longitud de hola.txt es : "+f.length());
  	  System.out.println(File.pathSeparator);
  	  File f2=new File(".","uno.info");
	  System.out.println("F2 existe?  "+f2.exists());
  	  f2.mkdir();
  	  System.out.println("F2 existe?  "+f2.exists());
	  // Vamos a crear subdirectorios  y  archivos para ello no puedo usar mkdir
          //ya que solo haria un directorio, por eso uso mkdirs
          File f3=new File(".", "uno/dos/tres/arch.txt");
   	  f3.mkdirs();
          File f4=new File(".","uno/dos/");
  	  System.out.println(f4.getParent());
  	  System.out.println(f4.getAbsolutePath());
  	  System.out.println(f4.getName());
   	  System.out.println(File.separator);
  	  System.out.println(File.pathSeparatorChar);
  	  System.out.println(File.separatorChar);
          File f5=new File ("../");
    	  String [] contenido=f5.list();
    	  System.out.println("El tamanio de contenido es : "+contenido.length);
    	  for(int i=0;i<contenido.length;i++)
        	System.out.println(contenido[i]+" es archivo?..."+new File(f5,contenido[i]).isFile());
     }//main
}//clase


