public class DamkaBoard {
	public static void main(String[] args){
		int given = 10; //Integer.parseInt(args[0]);

		for(int i = 0; i < given; i++){
				for(int j = 0; j < given; j++){
					if(i % 2 == 0){
						System.out.print("* ");
					} else {
						System.out.print(" *");
					}

					System.out.println();
				}
		}
	}
}