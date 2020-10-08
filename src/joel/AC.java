package joel;
import java.util.Scanner;
public class AC {

		static Scanner lector;
		public static void main(String[] args) {
			lector = new Scanner(System.in);
			int clase= lector.nextInt();
			int t = 0;
			int o = 0;
			for (o = 0; o < clase; o++) {
				
				int a = lector.nextInt();
				if (a > 0) {
					t++ ;
					}
				}
			if (o == clase) {
				System.out.println(t);
			}
			}	
		}
