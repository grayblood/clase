import java.util.ArrayList;
import java.util.Scanner;

public class violento {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int veg1 = sc.nextInt();
		for (int i = 0; i < veg1; i++) {
			int num = sc.nextInt();
			ArrayList<Integer> llista = new ArrayList<>();

			recursion(num, llista);
			int a = 1;
			int element = llista.get(a);
			if (element == 0) {
				llista.set(a, element + 1);
			} else if (element == 1) {
				llista.set(a, element - 1);
				a++;
				if (element2 == 1) {
					llista.set(a, element - 1);
				}

			}

			System.out.println(llista);

		}
	}

	public static void recursion(int number, ArrayList<Integer> llista) {
		if (number > 0) {
			recursion(number / 10, llista);
			llista.add(number % 10);
		}
	}

}
