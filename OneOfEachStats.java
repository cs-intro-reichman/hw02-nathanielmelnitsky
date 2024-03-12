public class OneOfEachStats1 {
	public static void main(String[] args){
		int t = Integer.parseInt(args[0]); //num of times to run expirament
		int numChild = 0; //number of children so far
		int boys = 0; //to store total number of boys/girls
		int girls = 0;
		boolean boy = false; //initializes bpy/girl values as not have happened yet
		boolean girl = false;
		String mean = "";

		//Declares special variables for countint total kids between t's
		//these special variables are not reninitialized
		int totalKids = 0;
		double avgFamSize = 0;
		int famsOf2 = 0;
		int famsOf3 = 0;
		int bigFams = 0;

		//for loop running the expirament t times
		for(int i = 0; i <= t; i++){

		//saves info from last loop to cumulative variable stats
		totalKids = totalKids + numChild;

		//if statements to store family sizes (before number of children is reinitialized)
		if(numChild == 2){
			famsOf2 = famsOf2 + 1;
		}
		if(numChild == 3){
			famsOf3 = famsOf3 + 1;
		}
		if(numChild >= 4){
			bigFams = bigFams + 1;
		}



			//reinitializes stats for next expirament
			boy = false;
			girl = false;
			numChild = 0;
			boys = 0;
			girls = 0;

			while(!(boy && girl)){

				//generates integer to later assign a childs identiry
				int identAssign = (int) (Math.random() * 10);

				numChild = numChild + 1; //counts total number of children so far (in current iteration only)

				//if boy use the int to assign boolean value

				if(identAssign > 5 ){
				boys = boys + 1;
				boy = true;

				}

				if(identAssign <= 5){
				girls = girls + 1;
				girl = true;

				}


			}
						//calculate family stats here
			avgFamSize = (double) totalKids / t;
			//calculats mean
			if(famsOf2 >= famsOf3 && famsOf2 >= bigFams){
				mean = "2";
			}
			if(famsOf3 > famsOf2 && famsOf3 > bigFams){
				mean = "3";
			}
			if(bigFams > famsOf2 && bigFams > famsOf3){
				mean = "4 or more";
			}

	}

	//prints stats
	System.out.println("Average: " + avgFamSize + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " + famsOf2);
	System.out.println("Number of families with 3 children: " + famsOf3);
	System.out.println("Number of families with 4 or more children: " + bigFams);
	System.out.println("The most common number of children is " + mean + ".");
}
}