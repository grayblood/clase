package array;

import java.util.Scanner;

public class Canvia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veg1 = sc.nextInt();
		for (int i = 0; i < veg1; i++) { // primer int
			int veg2 = sc.nextInt();

			int[] harray = new int[veg2];

			for (int k = 0; k < harray.length; k++) {
				harray[k] = sc.nextInt();
			}
			int pos0 = sc.nextInt();
			int pos1 = sc.nextInt();
			int j = 0;
			int posicio = 0;
			do {
				if (harray[j] == pos0) {
					posicio = j;
					harray[posicio] = pos1;
				}
				j++;
			} while (j < harray.length);
			

			for (int k = 0; k < harray.length; k++) {
				System.out.print(harray[k] + " ");

			}
			System.out.println();
		}
	}
}
