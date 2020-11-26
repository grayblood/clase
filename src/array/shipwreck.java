package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class shipwreck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veg1 = sc.nextInt();
		
		for (int i = 0; i < veg1; i++) {
			ArrayList<Integer> llista = new ArrayList<>();
			int veg2 = sc.nextInt();
			for (int j = 0; j < veg2; j++) {
				llista.add(sc.nextInt());
			}
			int max = Collections.max(llista);
			int min = Collections.min(llista);
			
			int res = max - min;
			

			System.out.println(res);
			
			
			
		}
	
	
	
	
	
	}
}
