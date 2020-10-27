import java.util.Scanner;

public class contarvocals {

	static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int veg = lector.nextInt();
		lector.nextLine();
		for (int l = 0; l < veg; l++) {
			String para = lector.nextLine();
			int longi = para.length();
			int a = 0;
			int e = 0;
			int i = 0;
			int o = 0;
			int u = 0;
			for (int j = 0; j < longi; j++) {
				char scan = para.charAt(j);
				if (scan == 'a' || scan == 'A') {
					a++;
				} else if (scan == 'e' || scan == 'E') {
					e++;
				} else if (scan == 'i' || scan == 'I') {
					i++;
				} else if (scan == 'o' || scan == 'O') {
					o++;
				} else if (scan == 'u' || scan == 'U') {
					u++;
				}

			}
			System.out.println("A: " + a + " E: " + e + " I: " + i + " O: " + o + " U: " + u);

		}
	}
}
