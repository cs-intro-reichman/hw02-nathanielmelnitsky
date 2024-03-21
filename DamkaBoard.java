public class DamkaBoard {
	public static void main(String[] args){
		int given = Integer.parseInt(args[0]);

		for(int i = 0; i < given; i++){
				for(int j = 0; j < given; j++){
					if(i % 2 == 0){
						System.out.println("* ");
					} else {
						System.out.println(" *");
					}

					System.out.println();
				}
		}
	}
}