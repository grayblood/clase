import java.util.Scanner;

public class explosio2 {
	private static Scanner lector2;

	public static void main(String[] args) {

		lector2 = new Scanner(System.in);

		int i = lector2.nextInt();
		int hp = lector2.nextInt();
		int total = 0;
		int at = 0;
		do {
			total = total + i;
			hp = hp - total;
			at++;
		} while (hp > 0);
		System.out.println(at);
	}
}
