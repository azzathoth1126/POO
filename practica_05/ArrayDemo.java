public class ArrayDemo {
    public static void main(String[] args) {
        int[] anArray;	        // declara un arreglo de enteros

        anArray = new int[10];	// crea el arreglo

        // inicializa los elementos del arreglo y lo imprime 
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = i;
            System.out.print(anArray[i] + " ");
        }
    }
}