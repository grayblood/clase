import java.util.Scanner;

public class spin {
	static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int end = 0;
		int pos = 0;
		int neg= 0;
		while (end == 0) {
			int num = lector.nextInt();
			
				if (num < 0) {
					neg++;
				}
				else if (num > 0) {
					pos++;
				}
				else if(num == 0) {
					end++;
				}
		}
		if (pos > neg) {
			System.out.println("POSITIUS");
		}
		else if (neg > pos) {
			System.out.println("NEGATIUS");
		}
		else {
			System.out.println("IGUALS");
		}
	}
}
