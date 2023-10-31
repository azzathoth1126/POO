public class Figuras{
	public static Figura randFigura(){
		switch((int)(Math.random()*3)){
			default:
			case 0:
				return new Circulo();
			case 1:
				return new Cuadrado();
			case 2:
				return new Triangulo();
			}
		}
	public static void main(String[] args){
		Figura[] s=new Figura[9];
		for(int i=0;i<s.length;i++)
			s[i]=randFigura();
		//Llamadas polimorficas
		for(int i=0;i<s.length;i++)
			s[i].dibujar();
		}
	}
