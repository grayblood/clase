package array3d;

import java.util.Arrays;
import java.util.Scanner;

public class a {
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
		String[] splitpos = n.split("(?<=\\G.)");
		for (int i = 0; i < splitpos.length; i++) {	
				
			

				switch (splitpos[i]) {
				case "V":
				case "v":
					s0 = array2d[0][0];
					s1 = array2d[1][0];

					array2d[0][0] = array2d[0][1];
					array2d[0][1] = s0;

					array2d[1][0] = array2d[1][1];
					array2d[1][1] = s1;

					break;

				case "H":
				case "h":
					s0 = array2d[0][0];
					s1 = array2d[0][1];

					array2d[0][0] = array2d[1][0];
					array2d[1][0] = s0;

					array2d[0][1] = array2d[1][1];
					array2d[1][1] = s1;

					break;

				}}
			
			
		for (int i = 0; i < files; i++) {
			for (int j = 0; j < columnes; j++) {
				System.out.print(array2d[i][j] + " ");
			}System.out.println();
		}
	}
}