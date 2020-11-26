package array;

import java.util.ArrayList;
import java.util.Scanner;

public class earray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arrayInts = new String[sc.nextInt()];
		for (int i = 0; i < arrayInts.length; i++) {
			arrayInts[i] = sc.nextLine();
			}
		
		for (int i = 0; i < arrayInts.length; i++) {
			System.out.println(arrayInts[i] + " ");
		}
		System.out.println();
		int n=sc.nextInt();
		System.out.println(arrayInts[n]);

	}
}
