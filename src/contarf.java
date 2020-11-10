import java.util.Scanner;

public class contarf {

	public static void main(String[] args) {
		String frase = "for fuck sake carl";
		int tamany = frase.length();
		int f = 0;
		for (int i = 0; i < tamany; i++) {
			char c = frase.charAt(i);
			if (c == 'f' || c == 'F') {
				f++;
			}
		}System.out.println(f);
	}
}
