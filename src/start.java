public class start {

    public static void main(String[] args){

        System.out.println("Endergebnis: " + Ulam(151));
    }

    public static int Ulam(int n){
        System.out.println("Die Zahl " + n + "...\n" );
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println("wird durch 2 geteilt.\n" );
            } else {
                n = n * 3 + 1;
                System.out.println("wird mit 3 multipiziert und eins dazu addiert.\n" );
            }
        }

        return n;
    }
}
