package funciones;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class menum2 {
	static Scanner sc = new Scanner(System.in);
		static String ju1 = "";
		static String ju2 = "";
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
		String busca = sc.next();
		if (judhm.containsKey(busca)) {
			// si existe continuamos
			ju1 = busca;
			System.out.println("Vols añadir jugador2 o vols jugar contra la maquina?( 0 = jugador , 1 = maquina)");
			int preg1 = sc.nextInt();
			if (preg1 == 0) {
				System.out.println("Escull nom de jugador2");
				String busca2 = sc.next();
				if (judhm.containsKey(busca2)) {
					ju2 = busca2;
					jugar(judhm);
				} else {
					// si no existe
					inexistent(judhm);

				}
			} else if (preg1 == 1) {
				// crear IA
				System.out.println("Pues de momento no hay");
			} else {
				// else de jugador 2
				inexistent(judhm);
			}

		} else {
			// else de jugador 1
			inexistent(judhm);

		}

	}

	private static void inexistent(HashMap<String, int[]> judhm) {
		// funcion para que no pueda salirse facilmente del circuito
		System.out.println("no existeix el jugador, Vols afegirlo? (0 = no , 1 = si)");
		int preg = sc.nextInt();
		if (preg == 0) {
			opcions(judhm);
		} else if (preg == 1) {
			definirjugadors(judhm);
		} else {
			System.out.println("volver al inicio");
			return;
		}
	}

	private static void definirjugadors(HashMap<String, int[]> judhm) {
		System.out.println("defineix al jugador");
		String n = sc.next();
		int[] vid = { 0, 0 };
		judhm.put(n, vid);
	}

	private static void veurej(HashMap<String, int[]> judhm) {
		System.out.println("A qui buscas?");
		String busca = sc.next();
		if (judhm.containsKey(busca)) {

			int[] vid = judhm.get(busca);
			System.out.println(busca + " " + Arrays.toString(vid));

		} else {
			System.out.println("no existeix");
		}

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
			comprobar(mines, taula, curs, jug, judhm, ju1, ju2 );

		}
	}

	private static void comprobar(int[][] mines, int[][] taula, Boolean curs, Boolean jug, HashMap<String, int[]> judhm, String ju1, String ju2) {
		int l = sc.nextInt();
		int c = sc.nextInt();
		int cont = 0;
		if (mines[l][c] == 1) {
			System.out.println("Eso fue una MINA");
			canvijug(jug);
			curs = false;
			fipart(jug, judhm, ju2, ju2);
		} else {
			for (int i = 0; i < taula.length; i++) {
				for (int j = 0; j < taula[0].length; j++) {
					if (taula[i][j] == 9) {
						cont++;
					}
				}
			}
			if (cont == 0) {
				curs = false;
				fipart(jug, judhm, ju1, ju2);
			} else {
				canvijug(jug);

			}
		}

	}

	private static void canvijug(Boolean jug) {
		if (jug == false) {
			jug = true;
		} else {
			jug = false;
		}

	}

	private static void fipart(Boolean jug, HashMap<String, int[]> judhm, String ju1, String ju2) {
		if (jug == false) {
			System.out.println("guanyador " + ju1);
			int[] vid = judhm.get(ju1);
			vid[0]++;
			judhm.put(ju1, vid);
			int[] vid2 = judhm.get(ju2);
			vid2[1]++;
			judhm.put(ju2, vid2);
			
		}else {
			System.out.println("guanyador " + ju2);
			int[] vid = judhm.get(ju2);
			vid[0]++;
			judhm.put(ju2, vid);
			int[] vid2 = judhm.get(ju1);
			vid2[1]++;
			judhm.put(ju1, vid2);
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
