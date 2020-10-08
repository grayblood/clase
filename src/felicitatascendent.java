import java.util.Scanner;

public class felicitatascendent {
	static Scanner lector;
	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int a = lector.nextInt() ;
		int b = lector.nextInt() ;
		int c = lector.nextInt() ;

		
		if ( c >= b + 1 && b >= a + 1) {
			System.out.println("SI");
		}
		else {
			System.out.println("NO");
		}	
	}
}