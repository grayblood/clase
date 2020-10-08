import java.util.Scanner;

public class barley {

	static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int rpeq = lector.nextInt() * 1;
		int rmed = lector.nextInt() * 2;
		int rgran = lector.nextInt() * 3;
		int res = rpeq + rmed + rgran ;
		if (res >= 10) {
			System.out.println("happy");
		}
		else {
			System.out.println("sad");
		}
		
	}
}