import java.util.Scanner;

public class x {
	static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int a = lector.nextInt();
		int b = lector.nextInt();
		int c = lector.nextInt();
		int n = lector.nextInt();
		if (a >= 18 && b >= 18 && c >= 18 && n >= 18) {
			if (a == b || a == c || a == n || b == c || b == n || c == n) {
				System.out.println("NO");
			} else {
				System.out.println("SI");
			}

		}
		else {
			System.out.println("K-BOOM");
		}
	}
}