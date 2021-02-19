package recur;

import java.util.Scanner;

public class nxifres {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int veg1 = sc.nextInt();
		for (int i = 0; i < veg1; i++) {
			
			int a= bitlles();
			
			System.out.println(a);
		}
	}

	private static int bitlles() {
		int bit = 0;
		int cont = 0;
		int files = sc.nextInt();
		for (int j = 0; j < files; j++) {
			cont++;
			bit = bit + cont;

		}return bit;
	}

	
	
}
