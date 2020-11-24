package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class virgolini {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veg1= sc.nextInt();
		for (int i = 0; i < veg1; i++) { //primer int
			int veg2= sc.nextInt();
			sc.nextLine();
			List<String> llista = new ArrayList<>();


			for (int j = 0; j < veg2; j++) { //segundo int
				llista.add(sc.nextLine());
			}

			int index = llista.indexOf("Francesco Virgolini");
			int pos1 = index - 1;
			if (index != 0) {
				 Collections.swap(llista, index, pos1);
				 System.out.println(llista);
			}else {
				System.out.println(llista);
			}

	

		}
	}
}

