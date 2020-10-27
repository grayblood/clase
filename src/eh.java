import java.util.Scanner;

public class eh {
	static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);

		int ehc = 0;
		int end = 0;
		int trab = 0;
		int paus = 0;
		int hist = 0;
		while (end == 0) {
			int eh = lector.nextInt();
			if (eh == 1) {
				ehc++;
			} else if (eh == 2) {
				trab++;
			} else if (eh == 3) {
				paus++;
			}
			else if (eh == 4) {
				hist++;
			}
			else if (eh == -1) {
				end++;
				System.out.println("eh counter: " + ehc + " se queda trabado o leyendo: " + trab + " pausa: " + paus + " tiempo de historia " + hist +" seguro que me he perdido mas seguro");
			} else {
				ehc++;
				trab++;
				paus++;
			}

		}

	}
}