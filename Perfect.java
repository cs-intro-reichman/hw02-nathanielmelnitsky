//sets up class
public class Perfect {
	public static void main (String[] s) {
        //gets num we want to check
		int given = Integer.parseInt(s[0]);
		int currentSum = 0;
		String divisors = "";
        //loops through numbers starting at first prime until the given
		for (int i = 2; i <= given; i++) {
            //if divisible by i and i is not given then we uppend
			if (given % i == 0 && given != i) {
				currentSum += i;
				divisors += " + " + i;
			}
		}
        //after all the uppending if the number is perfect prints with list of divisors
		if (given == currentSum + 1) {
			System.out.println(given + " is a perfect number since " + given + " = 1" + divisors);
		} else {
			System.out.println(given + " is not a perfect number");
		}
	}
}