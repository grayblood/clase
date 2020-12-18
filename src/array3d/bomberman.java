package array3d;

import java.util.Scanner;

public class bomberman {
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
		int pfil = sc.nextInt();
		int pcol = sc.nextInt();

		int up =0;
		int center =0;
		int down =0;
		int right =0;
		int left =0;
		
		int res = 0;
		

		if (pfil >= 0 && pcol >= 0 && pfil < fil && pcol < col) {
			center = array2d[pfil][pcol];
			res = res + center;

		}
		if (pfil - 1 >= 0 && pcol >= 0 && pfil - 1 < fil && pcol < col) {
			up = array2d[pfil - 1][pcol];
			res = res + up;

		}
		if (pfil + 1 >= 0 && pcol >= 0 && pfil + 1 < fil && pcol < col) {
			down = array2d[pfil + 1][pcol];
			res = res + down;

		}
		if (pfil >= 0 && pcol - 1 >= 0 && pfil < fil && pcol - 1 < col) {
			left = array2d[pfil][pcol - 1];
			res = res + left;

		}
		if (pfil  >= 0 && pcol +1 >= 0 && pfil < fil && pcol +1 < col) {
			right = array2d[pfil][pcol + 1];
			res = res + right;
			
		}

		System.out.println(res);
	}
}
