package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ratios {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veg1 = sc.nextInt();
		
		for (int i = 0; i < veg1; i++) {
			
			ArrayList<String> llista = new ArrayList<>();
			int veg2 = sc.nextInt();//casos que habra
			for (int j = 0; j < veg2; j++) {
				llista.add(sc.next());
			}
			llista.remove(sc.nextInt());
			
			for (int j = 0; j < llista.size(); j++) {
				System.out.print(llista.get(j) + " ");
			}
			System.out.println();
			
			
			
		}
	
	
	
	
	
	}
}