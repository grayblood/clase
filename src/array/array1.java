package array;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int vegades = lector.nextInt();
		for (int i = 0; i < vegades; i++) {
			int rep = lector.nextInt();
			Integer[] recordes = new Integer[rep];
			for (int j = 0; j < recordes.length; j++) {
				recordes[j] = lector.nextInt();
			}
			System.out.println(recordes[lector.nextInt()]);
		}
	}
}
