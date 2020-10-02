import java.util.Scanner;

public class SegonsAHores {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int segons = sc.nextInt();
		int minuts = segons / 60;
		segons = segons % 60;

		System.out.println(minuts + " minuts i " + segons + " segons");

	}

}
