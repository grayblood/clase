import java.util.Scanner;

public class contanotesbr {
	static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		double end = 0;
		int not = 0;
		int e = 0;
		int n = 0;
		int b = 0;
		int s = 0;
		int i = 0;
		int md = 0;
		int suma = 0;
		while (end == 0) {
			int num = lector.nextInt();
			if (num <= 10 && num >= 0) {
				suma = num + suma;
				if (num == 10 || num == 9) {
					e++;
					not++;
				} else if (num == 8 || num == 7) {
					n++;
					not++;
				} else if (num == 6) {
					b++;
					not++;
				} else if (num == 5) {
					s++;
					not++;
				} else if (num == 3 || num == 4) {
					i++;
					not++;
				} else if (num <= 2 && num >= 0) {
					not++;
					md++;
				}

			} else if (num == -1) {
				end = suma / not;
			}
		}
		System.out.println("NOTES: "+ not +" MITJANA: "+ end +" E: "+ e +" N: "+ n +" B: "+ b +" S: "+ s +" I: "+ i +" MD: "+ md);
	}
}