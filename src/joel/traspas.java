package joel;

import java.util.Scanner;

public class traspas {
	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int any = lector.nextInt() ;
		
		if ((any % 4 == 0)  && ((any % 100 != 0) || (any % 400 == 0))){
			System.out.println("SI");
		}
		else {
			System.out.println("NO");
		}
	}

}

