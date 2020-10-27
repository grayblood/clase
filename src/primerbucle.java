import java.util.Scanner;

public class primerbucle {

	static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int num = lector.nextInt();

		for (int i = 0; i < num; i++) {
			int a = lector.nextInt();
			System.out.println(a + 1);
		}

	}
}
