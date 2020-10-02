import java.util.Scanner;

public class SegonsAHores {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int segons = sc.nextInt();
		int minuts = segons / 60;
		segons = segons % 60;
		int hores = minuts / 60;
		minuts = minuts % 60;
		int dies = hores / 24;
		hores = hores % 24;
		

		System.out.println(dies + "dies, " + hores + "hores, " + minuts + " minuts i " + segons + " segons");

	}

}
