public class Palindromo{

    public static void main (String [] args) {

        char[] palindromo = args.toCharArray();

        boolean esPalindromo = true;
        int primerElem = palindromo[0];
        int ultimoElem = palindromo[palindromo.length - 1];

        while (primerElem < ultimoElem) {
            if (palindromo[primerElem] != palindromo[ultimoElem]) {
                esPalindromo = false;
                break;
            }
            primerElem++;
            ultimoElem--;
        }

        if (esPalindromo)
            System.out.println(args +" es un palíndromo."); 
        else 
            System.out.println(args + " no es un palíndromo.");

    }    
} 