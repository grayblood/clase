package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Unique {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veg1= sc.nextInt();
		for (int i = 0; i < veg1; i++) {
			int veg2= sc.nextInt();
			List<String> llista = new ArrayList<>();

			for (int j = 0; j < veg2; j++) {
				String l = sc.next();
				llista.add(l);
			}
	
		llista = llista.parallelStream().distinct().collect(Collectors.toList());
		System.out.println(llista);
		}
	}
}

