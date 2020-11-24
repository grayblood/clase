package array;

import java.util.Scanner;

public class comptar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int veg = sc.nextInt();
		for (int cas = 0; cas < veg; cas++) {
			int compt = 0;
			int k = sc.nextInt();
			int[] array = new int[k];
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}
			int num = sc.nextInt();
			for (int i = 0; i < array.length; i++) {
				if (array[i] == num) {
					compt++;
				}
			}


			System.out.println(compt);
		}

	}

}
