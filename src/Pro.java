import java.util.Scanner;

public class Pro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 9 || n >= 0) {
			//codigo
			Boolean fin = false;
			while (fin == false) {
				String frase = sc.nextLine();
				sc.next();
				String[] split = frase.split(" ");
				
				System.out.println(split);
				
			}
		}else {
			System.out.println("NO");
		}
	}
}
