package funciones;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class menum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String ju1 = "";
		String ju2 = "";
		Boolean end = false;

		HashMap<String, int[]> judhm = new HashMap<String, int[]>();
		do {
			System.out.println("Que vols fer?");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				opcions(judhm, ju1, ju2);

				break;
			case 2:
				definirjugadors(judhm, ju1, ju2);
				break;
			case 3:
				jugar();
				break;
			case 4:
				veurej(judhm, ju1, ju2);
				break;
			case 0:
				end = true;
				break;
			}

		} while (end == false);
	}

	private static void opcions(HashMap<String, int[]> judhm, String ju1, String ju2) {
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
					jugar();
				} else {
					// si no existe
					inexistent(judhm, ju1, ju2);

				}
			} else if (preg1 == 1) {
				// crear IA
			} else {
				// else de jugador 2
				inexistent(judhm, ju1, ju2);
			}

		} else {
			// else de jugador 1
			inexistent(judhm, ju1, ju2);

		}

	}

	private static void minas() {
		// Tamaño del tablero

	}

	private static void inexistent(HashMap<String, int[]> judhm, String ju1, String ju2) {
		// funcion para que no pueda salirse facilmente del circuito
		System.out.println("no existeix el jugador, Vols afegirlo? (0 = no , 1 = si)");
		int preg = sc.nextInt();
		if (preg == 0) {
			opcions(judhm, ju1, ju2);
		} else if (preg == 1) {
			definirjugadors(judhm, ju1, ju2);
		} else {
			System.out.println("volver al inicio");
			return;
		}
	}

	private static void definirjugadors(HashMap<String, int[]> judhm, String ju1, String ju2) {
		System.out.println("defineix al jugador");
		String n = sc.next();
		int[] vid = { 0, 0 };
		judhm.put(n, vid);
	}

	private static void veurej(HashMap<String, int[]> judhm, String ju1, String ju2) {
		System.out.println("A qui buscas?");
		String busca = sc.next();
		if (judhm.containsKey(busca)) {

			int[] vid = judhm.get(busca);
			System.out.println(busca + " " + Arrays.toString(vid));

		} else {
			System.out.println("no existeix");
		}

	}

	private static void jugar() {
		System.out.println("escoge tamaño de tablero");
		int num = 0;
		int minas = 5;
		do {

			int fil = sc.nextInt();

			if (fil <= 0) {
				System.out.println("genial, ganastes, ahora pon un numero mas grande y positivo");
			} else {
				num = fil;
			}

		} while (num == 0);
		int[][] tablero = new int[num][num];
		// rellenar tablero
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = 0;
			}
		}

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}

	}

}
