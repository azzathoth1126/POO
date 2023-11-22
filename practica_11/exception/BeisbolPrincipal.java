public class BeisbolPrincipal{
    public static void main(String args[]){
       
        boolean llov=false;
        try{
           int temp=Integer.parseInt(args[0]);
           if(args[1].equals("si"))
              llov=true;
           JugarBeisbol play = new JugarBeisbol(temp,llov);
           play.verificarCondiciones();
        }catch(DemasiadoCalor dc){
           dc.causa();
        }catch(ArrayIndexOutOfBoundsException aioobe){
           System.out.println("Forma de uso: java BeisbolPrincipal grados si|no");
        }
        finally{
           System.out.println("El flujo se encuentra en el metodo main");
        }
    }
}
