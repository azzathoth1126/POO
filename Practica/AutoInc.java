//Autoinc.java
public class AutoInc {
	public static void main( String [ ] args ) {
		int i = 1;
		prt( "i : " + i );
		prt( "i : " + ++i ); //Preincremento
		prt( "i++ : " + i++ ); //Postincremento
		prt( "i : " + i );
		prt( "i : " + --i ); //Predecremento
		prt( "i-- : " + i-- ); //Postincremento
		prt( "i : " + i );
		}
	static void prt( String s ){
		System.out.println( s );
		}
	}// fin clase