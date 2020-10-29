
import java.util.Scanner;

public class cartes {

	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);

		int vegades = lector.nextInt();
		for (int i = 0; i < vegades; i++) {
			int cartes = lector.nextInt();
			int pila = 0;
			int residu = 0;
			if (cartes > 0 && cartes <= 1000) {
				if (cartes <= 1) {
					residu++;
					System.out.println(pila + " " + residu);
				}

			} else {

			}
		}
	}
}