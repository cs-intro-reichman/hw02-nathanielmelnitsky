public class OneOfEach{
	public static void main(String[] args){
		String sen = "You made it... and you now have ";
		String sen2 = " children";
		String b = "b ";
		String g = "g ";
		String bg = "";
		int children = 0;
		boolean boy = false;
		boolean girl = false;
		System.out.println();

		
			while(!(boy && girl)){

						int child = (int) (Math.random() * 10);

				if(child > 5){

					children = children + 1;
					boy = true;
					System.out.print(bg + b);




			}

				if(child <= 5){

					children = children + 1;
					girl = true;
					System.out.print(bg + g);

			}
		}
			System.out.println();
			System.out.println(sen + children + sen2);
	}
}