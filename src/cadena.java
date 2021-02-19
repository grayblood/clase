import java.util.Scanner;

public class cadena {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int veg1 = sc.nextInt();
		for (int i = 0; i < veg1; i++) {
			
		}
	}
	private static void recursi(int l3, int c3, int[][] taula, int[][] minest) {

		if (l3 < 0 || c3 < 0 || l3 >= minest.length || c3 >= minest[0].length) {
			return;
		} else if (taula[l3][c3] != 9) {
			return;
		} else {
			taula[l3][c3] = 0;
			minest[l3][c3] = 9;
			// contaminas
			for (int i = l3 - 1; i <= l3 + 1; i++) {
				for (int j = c3 - 1; j <= c3 + 1; j++) {
					taula[l3][c3] = taula[l3][c3] + sortir(i, j, minest, taula);

				}
			}

			if (taula[l3][c3] == 0) {
				for (int i = l3 - 1; i <= l3 + 1; i++) {
					for (int j = c3 - 1; j <= c3 + 1; j++) {

						recursi(i, j, taula, minest);

					}
				}
			}
		}
	}
}
