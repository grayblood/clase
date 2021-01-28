import java.util.Scanner;

public class pat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veg1 = sc.nextInt();
		for (int i = 0; i < veg1; i++) {
			int veg2 = sc.nextInt();
			int res = 0;
			for (int j = 0; j < veg2; j++) {
				int a = sc.nextInt();
				res = res + a;
			}System.out.println(res);
		}
	}
}
