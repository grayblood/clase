import java.util.Scanner;

public class nota {
	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int cnot = 0;
		int deus = 0;
		int end = 0;
		while (end == 0) {
			int not = lector.nextInt();
			if (not >= 0 && not <= 10) {
				cnot++;
				if (not == 10) {
					deus++;
				}
			} else if (not == -1) {
				end++;
				System.out.println(" TOTAL NOTES: " + cnot + " NOTES10: " + deus);
			}
		}
	}
}