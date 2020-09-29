package joel;
import java.util.Scanner;

public class Caramels {
	private static Scanner lector2;

	public static void main(String[] args) {
		lector2 = new Scanner(System.in);
		int car = lector2.nextInt();
		int nens = lector2.nextInt();
		int div = 0;
		
		int res = 0;
		
		if (car > nens) {
			div = car/nens;
			res = car%nens;
			System.out.println(res);
		}
		else {
			System.out.println(res);
		}
        
	}
}
