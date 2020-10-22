import java.util.Scanner;

public class valormesgranpetit {
	static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int end = 0;
		int gran = 0;
		int pet = 0;
		while (end == 0) {
			int num = lector.nextInt();
			//problema es que si es negativo pilla 0
			if (num > gran) {
				gran = num;
			} 	
			
			else if (num < pet) {
				pet = num;
			}
			// final de linea
			else if (num == 0) {
				end++;
			}
		}
		System.out.println(gran + " " + pet);
	}
}