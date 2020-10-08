import java.util.Scanner;

public class texashold {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			// selectores de maximo y minimo
			int min = 1;
			int max = 6;
			//dados
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			//resultado		
			if (c1 == c2 && c2 == c3 || c1 == c2 || c2 == c3 || c1 == c3) {
				System.out.println("SI" );
			}
			
			else {
				System.out.println("NO" );
			}
	}	
}	
