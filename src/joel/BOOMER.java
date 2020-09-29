package joel;

import java.util.Scanner;

public class BOOMER {
	static Scanner lector;
	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int any = lector.nextInt() ;
		if (any >= 1945 && any < 1966) {
			System.out.println("ok boomer");
		}
		else {
			System.out.println("nah");
		}
	}

}
