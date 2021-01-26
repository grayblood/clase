import java.util.Scanner;

public class penjat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veg1 = sc.nextInt();
		for (int i = 0; i < veg1; i++) {

			String s1 = sc.nextLine();
			char[] ch = s1.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				System.out.print(ch[j]+ " ");
			}
		}
	}
}