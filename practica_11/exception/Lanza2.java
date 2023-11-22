public class Lanza2{
   public static void f() throws Exception{
	System.out.println("Originando excepion en: f()");
        throw new Exception("Lanzado desde f()");
   }
   public static void g() throws Throwable{
	try{
	   f();
	} catch(Exception e) { 
	   System.out.println("Dentro de g(), e.printStackTrace()");
	   e.printStackTrace();
	   //Throw e
	   throw e.fillInStackTrace();
	}
   }
   public static void main (String []args) throws Throwable{
	try{
	   g();
	} catch(Exception e) {
	  System.out.println("Cachando desde main e.printStackTrace()");
	  e.printStackTrace();
	}
  }//main
}//clase
