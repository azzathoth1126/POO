public class OperadoresRelacionales {
    public static void main(String[] args) {

       
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Valores de las variables...");
        System.out.println("    i = " + i);
        System.out.println("    j = " + j);
        System.out.println("    k = " + k);

	//Mayor que
        System.out.println("Mayor que...");
        System.out.println("    i > j es " + (i > j));     //falso
        System.out.println("    j > i es " + (j > i));     //verdadero
        System.out.println("    k > j es " + (k > j));     //falso, son iguales

	//Mayor o igual
        System.out.println("Mayor o igual que...");
        System.out.println("    i >= j es " + (i >= j));   //falso
        System.out.println("    j >= i es " + (j >= i));   //verdadero
        System.out.println("    k >= j es " + (k >= j));   //verdadero

	//Menor que
        System.out.println("Menor que...");
        System.out.println("    i < j es " + (i < j));     //verdadero
        System.out.println("    j < i es " + (j < i));     //falso
        System.out.println("    k < j es " + (k < j));     //falso

	//Menor o igual que
        System.out.println("Menor o igual que...");
        System.out.println("    i <= j es " + (i <= j));   //verdadero
        System.out.println("    j <= i es " + (j <= i));   //fals0
        System.out.println("    k <= j es " + (k <= j));   //verdadero

	//igual a 
        System.out.println("Igual que...");
        System.out.println("    i == j es " + (i == j));   //falso
        System.out.println("    k == j es " + (k == j));   //verdadero

	//Distinto
        System.out.println("Diferente que...");
        System.out.println("    i != j es " + (i != j));   //verdadero
        System.out.println("    k != j es " + (k != j));   //falso

    }
}
