
import java.util.Scanner;

public class gangplank {

	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);

		int vegades = lector.nextInt();
		for (int i = 0; i < vegades; i++) {
			int monedes = lector.nextInt();
			int start = lector.nextInt();
			boolean yo = true;
			boolean gangplank = true;

			if (start == 0) {
				yo = false;
			} else if (start == 1) {
				gangplank = false;
			}
			do {

				// yo flag
				do {
					if (monedes > 2) {
						monedes = monedes - 3;

					} else if (monedes == 2) {
						monedes = monedes - 2;
					} else if (monedes == 1) {
						monedes = monedes - 1;
					}
					if (monedes == 0) {
						System.out.println("JO");
						yo = true;
						gangplank = true;
					}
				} while (!yo);
				// gangplank
				do {
					if (monedes >= 3) {
						monedes = monedes - 3;
					} else if (monedes == 2) {
						monedes = monedes - 2;
					} else if (monedes == 1) {
						monedes = monedes - 1;
					}
					if (monedes == 0) {
						System.out.println("GANGPLANK");
						gangplank = true;
						yo = true;
					}
				} while (!gangplank);

			} while (monedes != 0);

		}
	}
}
