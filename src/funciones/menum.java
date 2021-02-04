package funciones;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class menum {
	static Scanner sc = new Scanner(System.in);
		static String ju1 = "";
		static int j1w = 0;
		static int j1l = 0;
		static String ju2 = "";
		static int j2w = 0;
		static int j2l = 0;
	public static void main(String[] args) {
		menu();
		
	}
	

	private static void menu() {
		
		
		Boolean end = false;

		HashMap<String, int[]> judhm = new HashMap<String, int[]>();
		do {
			end = false;
			System.out.println("Que vols fer?");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				opcions(judhm);

				break;
			case 2:
				definirjugadors(judhm);
				break;
			case 3:
				jugar(judhm);
				break;
			case 4:
				veurej(judhm);
				break;
			case 0:
				end = true;
				break;
			}

		} while (end == false);
		
	}

	private static void opcions(HashMap<String, int[]> judhm) {
		System.out.println("Escull nom de jugador1");
			ju1 = sc.next();
		System.out.println("Escull nom de jugador2");
			ju2 = sc.next();
			jugar(judhm);

	}


	private static void definirjugadors(HashMap<String, int[]> judhm) {
		System.out.println("defineix al jugador");
		String n = sc.next();
		int[] vid = { 0, 0 };
		judhm.put(n, vid);
	}

	private static void veurej(HashMap<String, int[]> judhm) {
		System.out.println(ju1 +" || "+ j1w +" || " + j1l);
		System.out.println(ju2 +" || "+ j2w +" || " + j2l);

	}

	private static void jugar(HashMap<String, int[]> judhm) {
		Boolean curs = false;
		// false == jug1 true == jug2
		Boolean jug = false;
		int m = 4;
			// 0 1 0 0
			// 0 0 0 1
			// 0 1 0 0
			// 1 0 1 0
		int[][] mines = {{0,1,0,0},{0, 0, 0, 1}, {0, 1, 0, 2}, {1, 0, 1, 0}};
		int[][] taula = new int[m][m];

		rellenar(mines, taula);

		while (curs != true) {
			mostrar(mines, taula);
			comprobar(mines, taula, curs, jug, judhm );

		}
	}

	private static void comprobar(int[][] mines, int[][] taula, Boolean curs, Boolean jug, HashMap<String, int[]> judhm) {
		int l = sc.nextInt();
		int c = sc.nextInt();
		int cont = 0;
		if (mines[l][c] == 0) {
			for (int i = 0; i < taula.length; i++) {
				for (int j = 0; j < taula[0].length; j++) {
					
				}
			}
			for (int i = l-1; i <= l+1; i++) {
				for (int j = c-1; j <= c+1; j++) {
					cont = cont + sortir(i,j,mines);
				}
			}taula[l][c] = cont;
			
			
		} else {
			System.out.println("Eso fue una MINA");
			canvijug(jug);
			curs = false;
			fipart(jug, judhm);
		}
			
			if (cont == 0) {
				curs = false;
				fipart(jug, judhm);
			} else {
				canvijug(jug);

			}

	}
		private static int sortir(int f, int c, int[][] mat) {
			if(f<0 || c<0 || f>=mat.length || c>=mat[0].length) {
				return 0;
			}else {
				//signifia que estem a dintre de la matriu;
				return mat[f][c];
			}
		}

	private static void canvijug(Boolean jug) {
		if (jug == false) {
			jug = true;
		} else if (jug == true) {
			jug = false;
		}

	}

	private static void fipart(Boolean jug, HashMap<String, int[]> judhm) {
		if (jug == false) {
			System.out.println("guanyador " + ju1);
			 j1w++;
			 j2l++;
			
		}else if (jug == true) {
			System.out.println("guanyador " + ju2);
			 j2w++;
			 j1l++;
		}

		menu();
	}

	private static void mostrar(int[][] mines, int[][] taula) {
		System.out.println("taulell");
		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[0].length; j++) {
				System.out.print(taula[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void rellenar(int[][] mines, int[][] taula) {
		// mines temporals
		// 4x4

		// 0 1 0 0
		// 0 0 0 1
		// 0 1 0 0
		// 1 0 1 0
		
		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[0].length; j++) {
				taula[i][j] = 9;
			}
		}

	}
}
