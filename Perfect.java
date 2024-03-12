public class Perfect {
    public static void main(String[] args) {
		//gets input
        int given = Integer.parseInt(args[0]);
		//will increment the candidate checking the remainder for divisibility
        int candidateFactor = 1;
		//used for check against remainder
        int perfNumCheck = 0;

		//loops finding divisors
        while (candidateFactor < given) {
            int remainder = given % candidateFactor;
            if (remainder == 0) {
                perfNumCheck += candidateFactor;
            }
			//increments to check next one
            candidateFactor++;
        }
        //prints if perfect
        if (perfNumCheck == given) {
            System.out.println(given + " is a perfect number since " + given + " = 1");
            candidateFactor = 2;
			//loop used to format the perfect num output so it shows all divisors added
            while (candidateFactor < given) {
                if (given % candidateFactor == 0) {
                    System.out.print(" + " + candidateFactor);
                }
                candidateFactor++;
            }
            System.out.println();
			//simple output for if not perfect num
        } else {
            System.out.println(given + " is not a perfect number");
        }
    }
}
