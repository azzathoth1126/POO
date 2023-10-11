class Array2D {
  public static void main( String args[] ){

    int miArray[][] = new int[3][];  
    miArray[0] = new int[2]; 
    miArray[1] = new int[3]; 
    miArray[2] = new int[4]; 

    for ( int i=0; i < 3; i++ ) {
      for ( int j=0; j < miArray[i].length; j++ )
        miArray[i][j] = i * j;
      }

    for ( int i=0; i < 3; i++ ) {
      for ( int j=0; j < miArray[i].length; j++ )
        System.out.print("miArray["+i+"]["+j+"]="+miArray[i][j]+"\n");
     }

    System.out.println( "Acceso a un elemento fuera de limites" );
    miArray[4][0] = 7;
    }
  }