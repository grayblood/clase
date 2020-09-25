package joel;

import java.util.Scanner;

public class tres {
	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		double num1 = lector.nextDouble();
		double num2 = lector.nextDouble();


        System.out.println(num1 * num2 / 2);
	}
}
