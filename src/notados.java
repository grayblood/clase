import java.util.Scanner;

public class notados {
	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int cnot = 0;
		int deus = 0;
		int not = lector.nextInt();
		do {
			if (not >= 0 && not <= 10) {
				cnot++;
			} else if (not == 10) {
				deus++;
			}
		} while (not != -1);
		System.out.println(" TOTAL NOTES: "+ cnot +" NOTES10: "+ deus);
			}
	}