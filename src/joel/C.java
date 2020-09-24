package joel;
import java.util.Scanner;
public class C {
	private static Scanner lector1;

	public static void main(String[] args) {
		lector1 = new Scanner(System.in);
		
		
		int num1 = lector1.nextInt();
		int num2 = lector1.nextInt();
		int res = num1 + num2 ;


        System.out.println(res);
	}
}