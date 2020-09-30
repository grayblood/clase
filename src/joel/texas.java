package joel;
	import java.util.Scanner;
public class texas {
			private static Scanner lector;

		public static void main(String[] args) {
			lector = new Scanner(System.in);
			int c1 = lector.nextInt();
			int c2 = lector.nextInt();
			int c3 = lector.nextInt();
		if (c1 == c2 && c2 == c3 && c3 == c1) {
			System.out.println("SI");
			
		}
		else {
			System.out.println("NO");
		}
		
		
		}
	

}
