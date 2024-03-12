public class InOrder {
	public static void main(String[] args){
		//gets input
		int min = 0;
		int max = 10;
		int genNum = 0;
		int newMin;
	do{
		//generates nums while the gen num is higher than previous and in the range
		newMin = genNum;
		genNum = (int)(Math.random() * (max - min) + min);
			if(genNum >= newMin){
				System.out.println(genNum);
			}

		}
		while(genNum >= newMin && genNum <= max);
	}
}
