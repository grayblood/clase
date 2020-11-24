package arrays;

import java.util.Scanner;

public class tenrecordes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ncasos = sc.nextInt();
		
		//bucle de casos
		for (int cas = 0; cas < ncasos; cas++) {
			int k = sc.nextInt();
			int[] array = new int[k];
			for (int i = 0; i < array.length; i++) {
				//primer ompliras la posicio 0, despres la 1, etc.
				array[i]= sc.nextInt();
			}
			//agafem posicio
			int posicio = sc.nextInt();
			//volem accedir a la posicio que li hem passat
			System.out.println(array[posicio]);
		}
		
	}

}
