package joel;
import java.util.Scanner;

public class Caramels {
	private static Scanner lector2;

	public static void main(String[] args) {
		lector2 = new Scanner(System.in);
		int car = lector2.nextInt();
		int nens = lector2.nextInt();
		int res = 0;
		
		if (car > nens && nens > 1) {
			res = car/nens;
			System.out.println(res);
		}
		else {
			System.out.println(0);
		}
        
	}
}
