package joel;

import java.util.Scanner;

public class quadrat {
		private static Scanner lector2;

		public static void main(String[] args) {
			lector2 = new Scanner(System.in);
			int num1 = lector2.nextInt();
			int num2 = num1 * num1 ;


	        System.out.println(num2);
		}
}