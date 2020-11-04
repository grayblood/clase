import java.util.Scanner;

public class epidemologia {
//P<=10^7  y N<=P y R<=10.
	private static Scanner lector2;

	public static void main(String[] args) {

		lector2 = new Scanner(System.in);

		int p = lector2.nextInt(); //gent total
		int n = lector2.nextInt();//quines estan infectades
		int r = lector2.nextInt(); //limite de infectados
		int dia = 0;
		
		do {
			n = n * r;
			
			p = p - n;
			dia++;
			
		} while (n <= p);
		System.out.println(dia);
	}
}

