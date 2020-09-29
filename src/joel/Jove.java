package joel;

import java.util.Scanner;

public class Jove {
	static Scanner lector;
	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int edad = lector.nextInt() ;
		if (edad < 29) {
			System.out.println("SI");
		}
		else {
			System.out.println("NO");
		}	
	}
}
