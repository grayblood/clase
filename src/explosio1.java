import java.util.Scanner;

public class explosio1 {
	private static Scanner lector2;

	public static void main(String[] args) {

		lector2 = new Scanner(System.in);

		int i = lector2.nextInt();
		int veg = lector2.nextInt();
		int total = 0;
		int at = 0;
		
		for (int j = 0; j < veg; j++) {
			total = total + i;
			at = at + total;
		} System.out.println(at);
	}
}