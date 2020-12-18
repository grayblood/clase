package array3d;

import java.util.Scanner;

public class b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array2d = new int[2][2];
		int cont = 1;
		int files = array2d.length;
		int columnes = array2d[0].length;
		for (int i = 0; i < files; i++) {
			for (int j = 0; j < columnes; j++) {
				array2d[i][j] = cont;
				cont++;
			}
		}

		int s0;
		int s1;
		String n = sc.next();
		
		int comptadorh = 0 ;
		int comptadorv = 0;
		char c;
		for (int i = 0; i < n.length(); i++) {
			c = n.charAt(i);
			if (c == 'h' || c == 'H') { 
				comptadorh++;
			}
			if (c == 'v' || c == 'V') { 
				comptadorv++;
			}
		}
		if (comptadorh > 1) {
			do {
				comptadorh = comptadorh - 2;
			} while (comptadorh > 1);
		}
		if (comptadorv > 1) {
			do {
				comptadorv = comptadorv - 2;
			} while (comptadorv > 1);
		}
		
		
		if (comptadorv == 1) {
			s0 = array2d[0][0];
			s1 = array2d[1][0];

			array2d[0][0] = array2d[0][1];
			array2d[0][1] = s0;

			array2d[1][0] = array2d[1][1];
			array2d[1][1] = s1;
		}if (comptadorh == 1) {
			s0 = array2d[0][0];
			s1 = array2d[0][1];

			array2d[0][0] = array2d[1][0];
			array2d[1][0] = s0;

			array2d[0][1] = array2d[1][1];
			array2d[1][1] = s1;
		}
		
	
		

			

		for (int i = 0; i < files; i++) {
			for (int j = 0; j < columnes; j++) {
				System.out.print(array2d[i][j] + " ");
			}
			System.out.println();
		}
	}
}