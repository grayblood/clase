import java.util.Scanner;

public class prueba {
	static Scanner sc = new Scanner(System.in);
	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Ingrese primer numero:");
		a = lector.nextInt();
		System.out.println("Ingrese segundo numero:");
		b = lector.nextInt();
		System.out.println("Ingrese el tipo de operacion:");
		String e = sc.next();
		char calc = e.charAt(0);
		;
		switch (calc) {
		case 'S':
		case 's':
			int s;
			s = (a + b);
			System.out.println("La suma es: " + s);
			break;
		case 'R':
		case 'r':
			int r;
			r = (a - b);
			System.out.println("La resta es: " + r);
			break;
		case 'M':
		case 'm':
			int m;
			m = (a * b);
			System.out.println("La multiplicación es: " + m);
			break;
		case 'D':
		case 'd':
			int d;
			d = (a / b);
			System.out.println("La division es: " + d);
			break;
		default:
			System.out.println("no existe esa operacion");
		}
	}
}