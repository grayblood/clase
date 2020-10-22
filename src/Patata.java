import java.util.Scanner;
public class Patata {

			static Scanner lector;
			public static void main(String[] args) {
				lector = new Scanner(System.in);
				int num= lector.nextInt();

				
				for (int o = 0; o < num; o++) {
					
					String a = lector.next();
					System.out.println(a);
			}
		
	}
}
