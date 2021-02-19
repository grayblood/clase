package recur;

import java.util.Scanner;

public class compta {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
			long num = sc.nextInt();
			long res = 1;
			recur(num, res);
			
		}
	
	private static void recur(long num, long res) {
		
		if (num > 0) {
			System.out.println(num);
			num--;
			recur(num, res);
		}else {
			System.out.println(0);
		}
		
		
		
	}
}
