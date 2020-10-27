import java.util.Scanner;
public class capicua {

	private static Scanner sc;

	public static void main(String[] args) {
		int inver = 0, cifra;
		sc = new Scanner(System.in);
		int num = sc.nextInt();

		int aux = num;
		while (aux != 0) {
			cifra = aux % 10;
			inver = inver * 10 + cifra;
			aux = aux / 10;
		}
		if (num == inver) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
}