import java.util.Scanner;

public class lisp {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int veg = sc.nextInt();
		for (int i = 0; i < veg; i++) {
			String frase = sc.next();
			int tamany = frase.length();
			int f = 0;
			Boolean Flag = false;
			for (int j = 0; j < tamany; j++) {
				char c = frase.charAt(j);
				switch (c) {
				case '(':
					f++;
					Flag= true;
					break;
				case ')':
					f--;
					Flag = false;
					break;
				default:
					break;
				}
			}if (f == 0 && Flag == false) {
				System.out.println("si");
			}else {
				System.out.println("no");
			}
		}
	}
}
