//BreakAndContinue.java
	public class BreakAndContinue {
		public static void main(String[ ] args) {
			for(int i=0;i<100;i++) {
				if(i==74)
					break; //sale del ciclo
				if(i%9!=0)
					continue;//siguiente iteración
				System.out.println(i);
				}//fin for
			int i=0;
			//ciclo infinito
			while(true) {
				i++;
				int j=i*27;
				if(j==1269)
					break;//sale del ciclo
				if(i%10!=0)
					continue;
				System.out.println(i);
				}//fin while
			}//fin main
		}//fin clase