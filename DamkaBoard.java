public class DamkaBoard {
	public static void main(String[] args){
		int given = Integer.parseInt(args[0]);
		int i; //used for collumns
		int j; //used for rows

		for(i = 0; i < given; i++){
				if(i % 2 != 0 && i != given - 1){
					System.out.print(" ");
				}
				for(j = 0; j < given; j++){
				System.out.print("* ");
				}
			System.out.println();
		}
	}
}