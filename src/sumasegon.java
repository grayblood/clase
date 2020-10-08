import java.util.Scanner;

public class sumasegon {
	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int h = lector.nextInt();
		int m = lector.nextInt();
		int s = lector.nextInt();

		s = s + 1;

		if (s >= 60) {
			s = s - 60 ;
			m = m + 1;
			
			if (m >= 60) {
				m = m - 60 ;
				h = h + 1;
				
				
				if (h >= 24) {
					h = 0 ;
					System.out.println(h + " " + m + " " + s);
				}
				else {
					System.out.println(h + " " + m + " " + s);
				}
			}
			else {
				System.out.println(h + " " + m + " " + s);
			}
		}
		
		else if (m >= 60) {
			m = m - 60 ;
			h = h + 1;
			
			if (h >= 24) {
				h = 0 ;
				System.out.println(h + " " + m + " " + s);
			}
			else {
				System.out.println(h + " " + m + " " + s);
			}
		}
		else if (h >= 24) {
			h = 0;
			System.out.println(h + " " + m + " " + s);
		}
		else {
			System.out.println(h + " " + m + " " + s);
		}
	}
}
