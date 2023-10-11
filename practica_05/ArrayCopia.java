class ArrayCopia{
  int primerArray[];
  int segundoArray[];

  ArrayCopia() {
    primerArray = new int[3];
    for ( int i=0; i < 3; i++ )
      primerArray[i] = i;
      segundoArray = new int[3];
      segundoArray = primerArray;
    }

  public static void main( String args[] ) {
    ArrayCopia obj = new ArrayCopia();

    System.out.println( "Contenido del primerArray" );
    for ( int i=0; i < 3; i++ )
      System.out.print( obj.primerArray[i] + " " );

    System.out.println( "\nContenido del segundoArray" );
    for ( int i = 0; i < 3; i++ )
      System.out.print( obj.segundoArray[i] + " " );

    System.out.println( "\n--> Cambiamos un valor en el primerArray" );
    obj.primerArray[1] = 10;
    System.out.println( "Contenido del primerArray" );
    for ( int i=0; i < 3; i++ )
      System.out.print( obj.primerArray[i] + " " );

    System.out.println( "\nContenido del segundoArray" );
    for ( int i=0; i < 3; i++ )
      System.out.print( obj.segundoArray[i] + " " );
    }
  }