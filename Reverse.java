public class Reverse {
    public static void main(String[] args) {
        // Receive input and declare variables
        String input = args[0];
        int length = input.length();
        String reversed = "";

        // Reverse the input string
        for (int i = length - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Print the reversed string
        System.out.println(reversed);

        // Print the middle character(s)
        if (length % 2 == 0) {
            // If the length is even, there are two middle characters
            int middle = length / 2;
            System.out.println("The middle characters are: " + input.charAt(middle - 1) + " and " + input.charAt(middle));
        } else {
            // If the length is odd, there's only one middle character
            int middle = length / 2;
            System.out.println("The middle character is: " + input.charAt(middle));
        }
    }
}
