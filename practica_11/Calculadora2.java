public class Calculadora2{
   public int sumar(int x, int y){
      int resultado=x+y;
      return resultado;
   }
   public int restar(int x, int y){
      int resultado=x-y;
      return resultado;
   }
   public int multiplicar(int x, int y){
      int resultado=x*y;
      return resultado;
   }
   public int dividir(int x, int y){
      int resultado=x/y;
      return resultado;
   }
   public int realizarOperacion(int x, int y, char o){
      int resultado=0;
      if( o == '+')
	 resultado=sumar(x,y);
      if( o == '-')
	 resultado=restar(x,y);
      if( o == 'x')
	 resultado=multiplicar(x,y);
      if( o == '/')
	 resultado=dividir(x,y);
      return resultado;
   }
}
