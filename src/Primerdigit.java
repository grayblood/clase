
import java.util.Scanner;

public class Primerdigit {

	static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int a = lector.nextInt();
		int b = lector.nextInt();
		int resa = 0;
		int resb = 0;
		if (a >= 10 && a <= 99) {
			resa = a / 10;
		} else if (a >= 100 && a <= 999) {
			resa = a / 100;

		} else if (a >= 1000 && a <= 9999) {
			resa = a / 1000;
		} else {
			System.out.println("K-BOOM");
		}
		if (b >= 10 && b <= 99) {
			resb = b / 10;
		} else if (b >= 100 && b <= 999) {
			resb = b / 100;
		} else if (b >= 1000 && b <= 9999) {
			resb = b / 1000;
		}
		
		if (resa > resb) {
			System.out.println("A");
		}
		else if (resa < resb) {
			System.out.println("B");
		}
		else if (resa == resb) {
			System.out.println("Son iguals");
		}
		else {
			System.out.println("K-BOOM");
		}
		
	}
}