package funciones;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class menum {
	static Scanner sc = new Scanner(System.in);
	// Cambiar
	static String ju1 = "Nadie";
	static int f = 0;
	static int c = 0;
	static int mines = 0;
	static HashMap<String, int[]> judhm = new HashMap<String, int[]>();

	public static void main(String[] args) {
		menu();

	}

	private static void menu() {

		Boolean end = false;

		do {
			end = false;
			System.out.println("Que vols fer?");
			System.out.println("1: Ayuda || 2: opciones || 3: jugar || Jugador: "+ ju1 +" || 4: ver jugadores");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				ayuda();

				break;
			case 2:
				opcions();

				break;
			case 3:
				jugar();
				break;
			case 4:
				veurej();
				break;
			case 0:
				end = true;
				break;
			}

		} while (end == false);

	}

	private static void ayuda() {
		System.out.println("Normas: ");
		System.out.println("El juego consiste en despejar todas las casillas de una pantalla que no oculten una mina.\r\n" + 
				"\r\n" + 
				"Algunas casillas tienen un número, este número indica las minas que son en todas las casillas circundantes.\r\n "
				+ "Así, si una casilla tiene el número 3, significa que de las ocho casillas que hay alrededor (si no es en una esquina o borde)\r\n"
				+ " hay 3 con minas y 5 sin minas. Si se descubre una casilla sin número indica que ninguna de las casillas vecinas tiene mina y\r\n"
				+ " estas se descubren automáticamente.\r\n" + 
				"\r\n" + 
				"Si se descubre una casilla con una mina se pierde la partida.");
		System.out.println();
		return;
	}

	private static void opcions() {
		definirjugadors();
		System.out.println("files del mapa");
		f = sc.nextInt();
		System.out.println("columnes del mapa");
		c = sc.nextInt();
		int res = f * c;
		System.out.println("numero de minas");
		mines = sc.nextInt();
		if (res - 1 < mines) {
			do {
				System.out.println("Demasiadas minas, ponga un numero valido:");
				mines = sc.nextInt();
			} while (res - 1 < mines);
		}

	}

	private static void definirjugadors() {
		System.out.println("defineix al jugador");
		String n = sc.next();
		int[] vid = { 0, 0 };
		judhm.putIfAbsent(n, vid);
		ju1 = n;
	}

	private static void veurej() {
		System.out.println("       Ladderboard");
		System.out.println(" |N| " + " |V| " + " |D| "  );
		for (String name : judhm.keySet()) {
			String key = name.toString();
			int[] value = judhm.get(name);
			
			System.out.println(key +"  " + value[0] +"     " + value[1]);
		}
	}

	private static void jugar() {

		int[][] minest = new int[f][c];
		int[][] taula = new int[f][c];

		rellenar(minest, taula);
		Boolean curs = true;
		while (curs == true) {
			mostrar(minest, taula);
			int fil = sc.nextInt();
			int col = sc.nextInt();
			comprobar(minest, taula, curs, fil, col);

		}
	}

	private static void comprobar(int[][] minest, int[][] taula, Boolean curs, int fil, int col) {
		Boolean vd = false;

		if (minest[fil][col] == 0) {

			recursi(fil, col, taula, minest);

		} else {
			curs = false;
			vd = true;
			fipart(vd, curs);
		}
		minesrestants(vd, taula, minest, curs);

	}

	private static void minesrestants(Boolean vd, int[][] taula, int[][] minest, Boolean curs) {
		int contanou = 0;
		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[0].length; j++) {
				if (taula[i][j] == 9) {
					contanou++;
				}
			}
		}
		if (mines == contanou) {
			vd = false;
			curs = false;
			fipart(vd, curs);

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

	private static int sortir(int f2, int c2, int[][] minest, int[][] taula) {

		if (f2 < 0 || c2 < 0 || f2 >= minest.length || c2 >= minest[0].length) {
			return 0;
		} else {
			if (minest[f2][c2] == 9) {
				return 0;
			} else {
				return minest[f2][c2];
			}

		}
	}

	private static void fipart(Boolean vd, Boolean curs) {
		if (vd == false) {
			System.out.println("guanyador");
			// sumar 1 victoria
			int[] valor = judhm.get(ju1);
			valor[0]++;
			judhm.put(ju1, valor);

		} else if (vd == true) {
			System.out.println("has perdut");
			// sumar 1 derrota al jugador
			int[] valor = judhm.get(ju1);
			valor[1]++;
			judhm.put(ju1, valor);
		}
		menu();

	}

	private static void mostrar(int[][] minest, int[][] taula) {
		System.out.println("taulell");
		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[0].length; j++) {
				System.out.print(taula[i][j] + " ");
			}
			System.out.println();
		}
		//
		//System.out.println();
		//for (int i = 0; i < taula.length; i++) {
		//	for (int j = 0; j < taula[0].length; j++) {
		//		System.out.print(minest[i][j] + " ");
		//	}
		//	System.out.println();
		//	}

	}

	private static void rellenar(int[][] minest, int[][] taula) {

		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[0].length; j++) {
				minest[i][j] = 0;
				taula[i][j] = 9;
			}
		}
		Random r1 = new Random();
		Random r2 = new Random();
		int mines2 = mines;
		for (int i = 0; i < mines2; i++) {
			int n1 = r1.nextInt(f);
			int n2 = r2.nextInt(c);
			if (minest[n1][n2] == 1) {
				mines2++;
			} else {
				minest[n1][n2] = 1;
			}

		}

	}
}
