class MiClase {
    int varInstancia = 100;
}


class PasoParametros {

    void pasoVariables( int varPrim, MiClase varRef ) {
        System.out.println( "--> Entrada en la funcion pasoVariables" );
        System.out.println( "Valor de la variable primitiva: "+varPrim );
        System.out.println( "Valor contenido en el objeto: "+varRef.varInstancia );

        System.out.println( "-> Modificamos los valores" );
        varRef.varInstancia = 101;
        varPrim = 201;

        System.out.println( "--> Todavia en la funcion pasoVariables" );
        System.out.println( "Valor de la variable primitiva: "+varPrim );
        System.out.println( "Valor contenido en el objeto: "+varRef.varInstancia );
    }

    public static void main( String args[] ) {


        PasoParametros aObj = new PasoParametros();

        MiClase obj = new MiClase();
        int varPrim = 200;

        System.out.println( "> Estamos en main()" );
        System.out.println( "Valor de la variable primitiva: "+varPrim );
        System.out.println( "Valor contenido en el objeto: "+obj.varInstancia );


        aObj.pasoVariables( varPrim,obj );

        System.out.println( "> Volvemos a main()" );
        System.out.println( "Valor de la variable primitiva, todavia : "+varPrim );
        System.out.println( "Valor contenido ahora en el objeto: "+obj.varInstancia );
    }
}