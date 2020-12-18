package array3d;

import java.util.Scanner;

public class blackfriday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fil = sc.nextInt();
		int col = sc.nextInt();
		int[][] array2d = new int[fil][col];

		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
				array2d[i][j] = sc.nextInt();
			}
		}
		int multi = sc.nextInt();
		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
				array2d[i][j] = array2d[i][j] * multi;
				System.out.print(array2d[i][j]+" ");
			}System.out.println();
		}

	}
}
