package array;

import java.util.ArrayList;
import java.util.Scanner;

public class concert {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> llista = new ArrayList<>();
		int afegir = sc.nextInt();
		do {			
			llista.add(afegir);
		} while (afegir != 0);

		System.out.println(llista);
		
		
	}

}
