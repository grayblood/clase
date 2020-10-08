package joel;

import java.util.Scanner;

public class aparcament {

	static Scanner lector;
	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int auto = lector.nextInt();
		int del = 0;
		del = auto / 2 ;
		del = del + auto;
		int tras = del;
		int del2 = del * 2;
		int f = 0;
		int b = 0;
		//arreglar aqui abajo
		for (int o = 0; o < 100; o++) {
			
			int a = lector.nextInt();
			if (a == 0) {
				b++ ;
				if (b == 2) {
					
				
				o = o + 100;
				}
			}
			else if (b == 1 && a == 0) {
				b = 0;
			}
			}
		if (del < del2 && del > auto) {
			f ++;
			System.out.println("Si" + f);
		}
		else {
			System.out.println("no");
		}
	}
}
