
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
					if (monedes > 3) {
						monedes = monedes - 3;
					} else if (monedes == 0 || monedes == 1 || monedes == 2 || monedes == 3) {
						System.out.println("JO");
						gangplank = true;
						yo = true;
					} else {
						gangplank = false;
						yo = true;
						monedes = - 2;
					}

				} while (!yo);
				// gangplank
				do {
					if (monedes > 3) {
						monedes = monedes - 3;
						if (monedes < 3) {
							System.out.println("GANGPLANK");
						}
					} else if (monedes == 0 || monedes == 1 || monedes == 2 || monedes == 3) {
						System.out.println("GANGPLANK");
						gangplank = true;
						yo = true;
					} else {
						gangplank = true;
						yo = false;
						monedes = - 2;
					}

				} while (!gangplank);

			} while (monedes != 0);

		}
	}
}
