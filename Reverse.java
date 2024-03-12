public class Reverse {
	public static void main(String[] args) {
		//recieves input and declares int for string length
		String input = args[0];
		int tester = input.length();
		String empty = "";
		

		while(tester > 0){
			char nextAddition = input.charAt(tester - 1);
			empty = empty + nextAddition;
			tester--;

		}
			System.out.println(empty);
			int length = input.length();
			System.out.println("The middle character is " + input.charAt(length/2));
	}
}