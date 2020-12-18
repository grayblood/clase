package array3d;

import java.util.Scanner;

public class pesca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int c = sc.nextInt();

		int[][] alg = new int[f][c];

		int fil = alg.length;
		int col = alg[0].length;

		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
				alg[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		int y = sc.nextInt();	
		if (alg[x][y] == 1) {
			System.out.println("Boom");
		} else {
			int comp = 0;
			for (int i = x - 1; i <= x + 1; i++) {
				for (int j = y - 1; j <= y + 1; j++) {
					if (i >= 0 && i < fil && j >= 0 && j < col) {
						if (alg[i][j] == 1) {
							comp++;
						}
					}
				}
			}System.out.println(comp);

			int nw = alg[x - 1][y - 1];
			int n = alg[x - 1][y];
			int ne = alg[x - 1][y + 1];
			int w = alg[x][y - 1];

			int sw = alg[x + 1][y - 1];
			int s = alg[x + 1][y];
			int se = alg[x + 1][y + 1];
			int e = alg[x][y + 1];

		}

	}
}
