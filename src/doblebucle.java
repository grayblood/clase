import java.util.Scanner;

//
public class doblebucle {
	static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);

		int num = lector.nextInt();
		num = num + 1;
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
		}
	}
}