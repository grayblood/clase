package joel;

import java.util.Scanner;

public class tres {
	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int num1 = lector.nextInt();
		int num2 = num1 * 3 ;


        System.out.println(num2);
	}
}
