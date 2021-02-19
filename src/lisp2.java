import java.util.Scanner;

public class lisp2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int veg = sc.nextInt();
		for (int i = 0; i < veg; i++) {
			String frase = sc.next();
			int tamany = frase.length();
			int f1 = 0;
			int f2 = 0;
			int f3 = 0;
			int f4 = 0;
			Boolean Flag1 = false;
			Boolean Flag2 = false;
			Boolean Flag3 = false;
			Boolean Flag4 = false;
			for (int j = 0; j < tamany; j++) {
				char c = frase.charAt(j);
				switch (c) {
				case '(':
					f1++;
					Flag1 = true;
					break;
				case ')':
					f1--;
					Flag1 = false;
					break;
				case '[':
					f2++;
					Flag2 = true;
					break;
				case ']':
					f2--;
					Flag2 = false;
					break;
				case '{':
					f3++;
					Flag3 = true;
					break;
				case '}':
					f3--;
					Flag3 = false;
					break;
				case '<':
					f4++;
					Flag4 = true;
					break;
				case '>':
					f4--;
					Flag4 = false;
					break;
				default:
					break;
				}
			}
			if (f1 == 0 && Flag1 == false|| f2 == 0 && Flag2 == false || f3 == 0 && Flag3 == false || f4 == 0 && Flag4 == false) {
				System.out.println("si");
			} else {
				System.out.println("no");
			}
		}
	}
}