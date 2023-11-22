import java.util.*;
    public class I18NArgumentosTryCatch{
	ResourceBundle mensajes;

	public void obtenerIdioma(String idioma, String pais){
		Locale localizacion = new Locale(idioma,pais);
		mensajes = ResourceBundle.getBundle("MisDatos",localizacion);
		System.out.println(mensajes.getString("idioma")); 
		System.out.println(mensajes.getString("cadena1")); 
		System.out.println(mensajes.getString("cadena2")); 
		System.out.println(mensajes.getString("cadena3")); 
	}
	
	public static void main(String args[]){ 
	    try{
		String idioma=args[0];
		String pais=args[1];
		I18NArgumentosTryCatch i18na = new I18NArgumentosTryCatch();
		i18na.obtenerIdioma(idioma,pais);
	    }catch(ArrayIndexOutOfBoundsException aioobe){
            	System.out.println("Forma de uso: java I18NArgumentosTryCatch idioma pais");
            }
	}
}
