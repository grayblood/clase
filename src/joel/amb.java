package joel;


import java.util.Scanner;
public class amb {
	private static Scanner lector12;

	public static void main(String[] args) {
		lector12 = new Scanner(System.in);
		
		
		String num1 = lector12.next();
		String num2 = lector12.next();


        System.out.println(num1 + " amb " + num2);
	}
}