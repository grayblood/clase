import java.util.Scanner;

public class IntroFlags {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		// per conveni un flag s'inicia a false i s'activa a true.
		boolean flag = false;

		do {
			int num = sc.nextInt();

			if (num < 0) {
				// activem el flag
				flag = true;
			} else {
				System.out.println(num + 1);
			}
		} while (!flag);

		/**
		 * Llegeix strings i torna la string +"a" fins que llegeixis "FIN".
		 */
		

		boolean flagString = false;
		while (!flagString) {
			String s = sc.nextLine();
			if (s.equals("FIN")) {
				flag = true;
			} else {
				System.out.println(s + "a");
			}
		}

	}

}