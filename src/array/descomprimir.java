package array;

import java.util.Scanner;

public class descomprimir {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int veg1 = sc.nextInt();
		for (int i = 0; i < veg1; i++) {
			
			int num = sc.nextInt();
			String l = sc.next();
			String[] S = new String[num];
			for (int j = 0; j < S.length; j++) {
				S[j] = l;
			}
			for (int j = 0; j < S.length; j++) {
				System.out.print(S[j]);
			}System.out.println();
		}

	}
}
