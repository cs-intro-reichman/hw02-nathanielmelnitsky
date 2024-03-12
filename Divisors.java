public class Divisors {
	public static void main(String[] args){
		//gets input
	int given = Integer.parseInt(args[0]);

		//declares variable for running the loop
	int tester = 1;

	//loops from 1 until given checking divisibility
	while (tester < given){
		int remainder = given % tester;

		if(remainder == 0){
			System.out.println(tester);
		}
		tester++;
	}
	System.out.println(given);
	}
}