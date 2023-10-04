public class VAC {

    public static void main(String[ ] args) {
        for(int i=0;i<10;i++) {
            char c=(char)(Math.random()*26+'a');
            System.out.print(i+"="+c + ": ");
            switch( c ) {
                case 'a':
                case 'e':
                case  'i':
                case 'o':
                case 'u':
                System.out.println("vocal");
                break;
                default:
                System.out.println("consonante");
            }   
        }
    }
    
}