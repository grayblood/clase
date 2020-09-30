import java.util.Scanner;

public class contigus {
	static Scanner lector;
	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int a = lector.nextInt() ;
		int b = lector.nextInt() ;

		
		
		if ( a == b + 1 || a == b - 1) {
			System.out.println("SI");
		}
		else {
			System.out.println("NO");
		}	
	}
}

