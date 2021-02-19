package recur;

import java.util.Scanner;

public class millor {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int veg1=sc.nextInt();
		for (int i = 0; i < veg1; i++) {
			long num = sc.nextInt();
			long res = 1;
			recur(num, res);
			
		}
	}
	private static void recur(long num, long res) {
		for (int i = 0; i < num; i++) {
			
		}
		if (num > 0) {
			res = res * num;
			num--;
			recur(num, res);
		}else {
			System.out.println(res);
		}
		
		
		
	}
}
