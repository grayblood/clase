package array3d;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f= sc.nextInt();
		int c = sc.nextInt();
		String[][] ald = new String[f][c];
		int files = ald.length;
		int columnes = ald[0].length;
		for (int i = 0; i < files; i++) {
			for (int j = 0; j < columnes; j++) {
				ald[i][j]=".";
			}
		}
		
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		
		//poner el igual!!!
		for (int i = a1; i <= a2; i++) {
			for (int j = b1; j <= b2; j++) {
				ald[i][j]="X";
			}
		}
		for (int i = 0; i < files; i++) {
			for (int j = 0; j < columnes; j++) {
				System.out.print(ald[i][j]+ " ");
			}System.out.println();
		}
	}
}
