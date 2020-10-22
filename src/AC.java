import java.util.Scanner;
public class AC {

		static Scanner lector;
		public static void main(String[] args) {
			lector = new Scanner(System.in);
			int clase= lector.nextInt();

			
			for (int o = 0; o < clase; o++) {
				
				int a = lector.nextInt();
				if (a == 0 || a == 180 || a >= 360) {
					System.out.println("OK");
				}
				else {
					System.out.println("BRONCA");
				}
			}	
		}
	
}