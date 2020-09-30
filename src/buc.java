import java.util.Scanner;

public class buc {
	static Scanner lector;
	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int patata= lector.nextInt();
		int i = 0;

		
		for (int o = 0; o < patata; o++) {
			
			int a = lector.nextInt();
			for (i = 0; i < a; i++) {
			System.out.println("No ofendre al president patata");
			}
		}	
	}
}