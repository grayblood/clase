import java.util.Scanner;

public class diferencia {
	static Scanner lector;
	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int a = lector.nextInt() ;
		int b = lector.nextInt() ;
		int res = 0;
		if (a > b) {
			res = a - b;
			System.out.println(res);
		}
		else {
			res = b - a;
			System.out.println(res);
		}
	}
}