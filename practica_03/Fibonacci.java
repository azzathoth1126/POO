class Fibonacci{
    public static void main(String[] args) {
        /** Imprime la secuencia de Fibonacci para valores < 50 */
        int ba = 1;
        int al = 1;

        System.out.println(ba);

        while (al < 50) {
            System.out.println(al);
            al = ba + al;   // Nuevo al
            ba = al - ba;   /** El nuevo ba es ( sum - anterior ba,,
                              es decir, al anterior al. */
        }
    }
}