
import java.util.Scanner;

public class diferencia2 {
	static Scanner lector;
	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int a = lector.nextInt() ;
		int b = lector.nextInt() ;
		int c = lector.nextInt() ;
		int res = 0;
		
		//a mayor, b peque�o
		if (a > b && c > b) {
			res = a - b;
			System.out.println(res);
		}
		// b mayor, a peque�o
		else if (b > a && c > a) {
			res = b - a;
			System.out.println(res);
		}
		// c mayor, b peque�o
		else if (c > b && a > b) {
			res = c - b;
			System.out.println(res);
		}
		// c mayor, a peque�o
		else if (c > b && b > a) {
			res = c - a;
			System.out.println(res);
		}
		// a mayor, c peque�o
		else if (a > b && b > c) {
			res = a - c;
			System.out.println(res);
		}
		// b mayor, c peque�o
		else if (b > a && a > c) {
			res = b - c;
			System.out.println(res);
		}
		// todos iguales
		else if (a == b && a == c){
			System.out.println(res);
		}
		
		//a y b iguales c diferente
		else if (a == b && a > c){
			res = a - c;
			System.out.println(res);
		}
		else if (a == b && a < c){
			res = c - a;
			System.out.println(res);
		} 
		
		// a y c iguales b
		else if (a == c && a > b){
			res = a - b;
			System.out.println(res);
		}
		else if (a == c && a < b){
			res = b - a;
			System.out.println(res);
		}
		
		// b y c iguales A diferente
		else if (b == c && b > a){
			res = b - a;
			System.out.println(res);
		}
		else if (b == c && b < a){
			res = a - b;
			System.out.println(res);
		}
		else {
			System.out.println("algo falla revisalo");
		}
		
	}
}