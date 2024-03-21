public class Reverse {
    public static void main(String[] args) {
        // gets input
        String input = args[0];
        int length = input.length();
        String reversed = "";

        // Reverses from decrement
        for (int i = length - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // prints
        System.out.println(reversed);

        // print the mid chars
        if (length % 2 == 0) {
            //length even, there are two middle chars -> find second one
            int middle = length / 2;
            System.out.println("The middle character is " + input.charAt(middle - 1));
        } else {
            // length is odd -> only one mid char
            int middle = length / 2;
            System.out.println("The middle character is " + input.charAt(middle));
        }
    }
}
