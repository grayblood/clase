package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class real {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veg1 = sc.nextInt();
		for (int i = 0; i < veg1; i++) {
			ArrayList<Integer> cartes = new ArrayList<>();
			for (int j = 0; j < 7; j++) {
				cartes.add(sc.nextInt());
			}
			int a = 0;
			for (int j = 0; j < 13; j++) {
				int numElements = Collections.frequency(cartes, j);
				if (numElements > 0) {
					a++;
				}
			}
			if (a >= 5) {
				System.out.println("ESCALA");
			} else {
				System.out.println("NO");
			}

		}
	}
}
