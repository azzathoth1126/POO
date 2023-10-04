public class IfElse {
	static int test(int testval,int target) { //Se declaro un metodo static para llamarlo sin un objeto
		int resultado=0;
		if(testval>target)
			resultado=+1;
		else if(testval<target)
			resultado=-1;
		else
			resultado=0;
		return resultado;
		}
	public static void main(String [ ] args) {
		System.out.println(test(10,5));
		System.out.println(test(5,10));
		System.out.println(test(5,5));
		}
	}//fin clase

/**
public class IfElse {
	int test(int testval,int target) { //Se declaro un nuevo metodo para llamar a el metodo
		int resultado=0;
		if(testval>target)
			resultado=+1;
		else if(testval<target)
			resultado=-1;
		else
			resultado=0;
		return resultado;
		}
	public static void main(String [ ] args) {

		IfElse ie = new IfElse();

		System.out.println(ie.test(10,5));
		System.out.println(ie.test(5,10));
		System.out.println(ie.test(5,5));
		}
	}//fin clase
 */