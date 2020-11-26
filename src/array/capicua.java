package array;

import java.util.Scanner;

public class capicua {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		String se = sb.toString();	
		sb.reverse();
		String st = sb.toString();
		if (st.equals(se)) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
		
	}
}
