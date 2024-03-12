public class Divisors {
    public static void main(String[] args) {
        // Gets input
        int given = Integer.parseInt(args[0]);

        // Declares variable for running the loop
        int tester = 1;

        // Loops from 1 until given checking divisibility
        while (tester <= given) { //tester == given
            int remainder = given % tester;

            if (remainder == 0) {
                System.out.println(tester);
            }
            tester++;
        }
    }
}