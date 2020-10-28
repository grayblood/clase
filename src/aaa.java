
import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vegades = sc.nextInt();
		for (int i = 0; i < vegades; i++) {

			int num;
			int mayor = 0;
			//contador hasta 5
			int cont;
			for (cont = 0; cont < 5; cont++) {
				num = sc.nextInt();
				if (num > mayor) {
					mayor = num;
				}
			}
			if (mayor >= 10000) {
				System.out.println("M");
			} else if (mayor >= 1000 && mayor < 10000) {
				System.out.println("B");
			} else {
				System.out.println("H");
			}
		}

	}
}