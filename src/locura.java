import java.util.Scanner;

public class locura {
	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int a = lector.nextInt();
		int b = lector.nextInt();
		int c = lector.nextInt();
		int d = lector.nextInt();
		int e = lector.nextInt();

		if (a > b ) {
			if (b < c) {
				if (c > d) {
					if (d < e) {
						System.out.println("SI");
					}
					else {
						System.out.println("NO");
					}
					
				}
				else {
					System.out.println("NO");
				}
				
			}
			else {
				System.out.println("NO");
			}
		}
		else if (a < b ) {
			if (b > c) {
				if (c < d) {
					if (d > e) {
						System.out.println("SI");
					}
					else {
						System.out.println("NO");
					}
					
				}
				else {
					System.out.println("NO");
				}
				
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			System.out.println("NO");
		}
	}
}


