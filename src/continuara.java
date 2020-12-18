import java.util.Arrays;
import java.util.Scanner;

public class continuara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] s = a.split(" ");

		int o = 1;
		int h = s.length - 1;
		int h2 = s.length;
		for (int i = 0; i < h; i++) {
			int as = s[o].length();
			int os = s[i].length();
			o++;
			if (os < as) {
				System.out.print(s[i] + "... ");
			} else {
				System.out.print(s[i] + " ");
			}
		}System.out.println(s[h2 -1]);

	}
}
