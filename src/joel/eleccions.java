package joel;

import java.util.Scanner;



public class eleccions {
	
		private static Scanner lector2;

		public static void main(String[] args) {
			lector2 = new Scanner(System.in);
			int can1 = lector2.nextInt(); //Jiden
			int can2 = lector2.nextInt(); //Drump
			int can3 = lector2.nextInt(); //Banders
			
			if (can1 > can2) {
				if (can1 > can3) {
					System.out.println("Jiden");
				}
			}
	        if (can2 > can1) {
				if (can2 > can3) {
					System.out.println("Drump");
				}
			}
	        if (can3 > can1) {
				if (can3 > can2) {
					System.out.println("Banders");
				}
			}
		
	}

}