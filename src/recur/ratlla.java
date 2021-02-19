package recur;

import java.awt.Cursor;
import java.util.HashMap;
import java.util.Scanner;

public class ratlla {
	static Scanner sc = new Scanner(System.in);
	// Cambiar
	static String ju1 = "Nadie";
	static String ju2 = "Nadie2";
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
			System.out.println(
					"1: Ayuda || 2: Definir jugadors || 3: jugar || 1: " + ju1 + " 2: " + ju2 + "|| 4: ver jugadores");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				ayuda();

				break;
			case 2:
				definirjugadors();

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
		System.out.println(
				"Cada jugador elige las X o las O, y en su turno debe poner una, intentando conseguir 3 seguidas en una línea vertical,\r\n"
						+ " horizontal o diagonal.");
		return;
	}

	private static void definirjugadors() {
		System.out.println("defineix al jugador");
		String n = sc.next();
		int[] vid = { 0, 0 };
		judhm.putIfAbsent(n, vid);
		ju1 = n;
		System.out.println("defineix al jugador2");
		String n2 = sc.next();
		judhm.putIfAbsent(n2, vid);
		ju2 = n2;
	}

	private static void veurej() {
		System.out.println("       Ladderboard");
		System.out.println(" |N| " + " |V| " + " |D| ");
		for (String name : judhm.keySet()) {
			String key = name.toString();
			int[] value = judhm.get(name);

			System.out.println(key + "  " + value[0] + "     " + value[1]);
		}
	}

	private static void jugar() {

		int[][] taula = new int[3][3];

		rellenar(taula);
		// false j1
		// true j2
		Boolean turn = true;
		Boolean curs = true;
		do {
			
		
			turn = torn(turn);
			mostrar(taula);
			int fil = sc.nextInt();
			int col = sc.nextInt();
			comprobar(taula, fil, col, turn);
			guanya(taula,fil,col);
			minesrestants(turn, taula, curs);
		}while (curs == true);
		
	}

	private static void guanya(int[][] taula, int fil, int col) {
		
		
	}

	private static void minesrestants(Boolean turn, int[][] taula, Boolean curs) {
		int contanou = 0;
		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[0].length; j++) {
				if (taula[i][j] == 9) {
					contanou++;
				}
			}
		}
		if (contanou == 0) {
			curs = false;
			empat(curs, turn);

		}else {
			return;
		}

	}

	private static void empat(Boolean curs, Boolean turn) {
	System.out.println("empate nadie gana");
	curs = false;
	menu();
	}

	private static void fipart(Boolean curs, Boolean turn) {
		if (turn == false) {
			System.out.println("guanyador");
			// guanyador jug 1
			int[] valor = judhm.get(ju1);
			valor[0]++;
			judhm.put(ju1, valor);
			int[] valor2 = judhm.get(ju2);
			valor2[1]++;
			judhm.put(ju2, valor2);
			
		} else if (turn == true) {
			//guanyador jug 2
			System.out.println("guanyador");
			int[] valor = judhm.get(ju2);
			valor[0]++;
			judhm.put(ju2, valor);
			int[] valor2 = judhm.get(ju1);
			valor2[1]++;
			judhm.put(ju1, valor2);
		}
		menu();

	}

	private static Boolean torn(Boolean turn) {
		if (turn == false) {
			return true;
		} else if (turn == true) {
			return false;
		}
		return turn;
	}

	private static void rellenar(int[][] taula) {

		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[0].length; j++) {
				taula[i][j] = 9;
			}

		}

	}

	private static void mostrar(int[][] taula) {
		System.out.println("taulell");
		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[0].length; j++) {
				System.out.print("| " + taula[i][j] + " |");
			}
			System.out.println();
		}

	}

	private static void comprobar(int[][] taula, int fil, int col, Boolean turn) {
		if (taula[fil][col] != 9) {
			return;
		} else {

			if (turn == false) {
				taula[fil][col] = 1;
				return;
			} else if (turn == true) {
				taula[fil][col] = 0;
				return;
			}

		}
	}

}
