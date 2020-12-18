package array;

import java.util.ArrayList;
import java.util.Scanner;

public class aprox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veg1 = sc.nextInt();
		for (int i = 0; i < veg1; i++) {
			int veg2 = sc.nextInt();
			ArrayList<Integer> mida = new ArrayList<>();
			for (int j = 0; j < veg2; j++) {
				mida.add(sc.nextInt());
			}
			int m = sc.nextInt();
			int m1 = m - 1;
			int m2 = m + 1;
			boolean p = mida.contains(m1);
			boolean s = mida.contains(m);
			boolean g = mida.contains(m2);
			if(p || s || g) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}

			
		}

	}
}
