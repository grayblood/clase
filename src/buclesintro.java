
import java.text.NumberFormat;
import java.util.Scanner;

public class buclesintro {

	static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int entrada = lector.nextInt();

		for (int i = 0; i < entrada; i++) {
			int n = lector.nextInt();
			
			if (n <= 0) {
				System.out.println("ELS NOMBRES NATURALS COMENCEN EN 1");
			} else {
				int j = 0;
				int ress = 0;
				int resm = 0;
				
				while (j < n) {
					ress = j + n;
					resm = j * n;
					j++;
				}
				System.out.println("SUMA: " + ress + " PRODUCTE: " + resm);
				
				
			}

		}

	}
}
