import java.util.Scanner;

public class poker2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			// selectores de maximo y minimo
			int min = 1;
			int max = 6;
			//dados
			int d1 = sc.nextInt();
			int d2 = sc.nextInt();
			int d3 = sc.nextInt();
			int d4 = sc.nextInt();
			// saber los dados
			System.out.println("dado 1: " + d1 );
			System.out.println("dado 2: " + d2 );
			System.out.println("dado 3: " + d3 );
			System.out.println("dado 4: " + d4 );
			
			//resultado		
			if (d1 == d2 && d2 == d3 && d3 == d4) {
				System.out.println("POKER" );
			}
			
			else if (d1 == d2 && d1 == d3 || d1 == d2 && d1 == d4 || d1 == d3 && d1 == d4 || d2 == d3 && d2 == d4) {
				System.out.println("TRIO" );	
			}
			
			else if (d1 == d2 || d1 == d3 || d1 == d4 || d2 == d3 || d2 == d4 || d3 == d4) {
				System.out.println("PARELLA");
			}
			
			else {
				System.out.println("RES");
			}
	}	
}	
