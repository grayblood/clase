package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Earray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrayInts = new int[sc.nextInt()];
		for (int i = 0; i < arrayInts.length; i++) {
			arrayInts[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arrayInts.length; i++) {
			System.out.print(arrayInts[i] + " ");
		}
		System.out.println();
		int n=sc.nextInt();
		System.out.println(arrayInts[n]);

	}
}
