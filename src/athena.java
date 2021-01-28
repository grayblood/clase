import java.util.Scanner;

public class athena {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int veg1 = sc.nextInt();
		for (int cas = 0; cas < veg1; cas++) {
			
			int[][] matriu = omplirMatriu();
			int l = sc.nextInt();
			int c = sc.nextInt();
			if(matriu[l][c]==1) {
				int acc = 0;
				for (int i = l-1; i <= l+1; i++) {
					for (int j = c-1; j <= c+1; j++) {
						acc = acc + comprovar(i,j,matriu);
					}
					
				}System.out.println(acc);
			}else {
				System.out.println("-1");

			}
			
			
		}
	}

	private static int[][] omplirMatriu() {
		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] matriu = new int[l][c];
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				matriu[i][j] = sc.nextInt();
			}
		}
		return matriu;
	}
	
	private static int comprovar(int f, int c, int[][] mat) {
		if(f<0 || c<0 || f>=mat.length || c>=mat[0].length) {
			return 0;
		}else {
			if (mat[f][c] == 2) {
				return 1;
			}else {
				return 0;
			}
			
		}
	}

}
