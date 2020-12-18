package array3d;

import java.util.HashMap;
import java.util.Scanner;

public class primer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> taula = new HashMap<String, Integer>();
		while (true) {

			String mapa = sc.nextLine();
			if (mapa.equals("xxx")) {
				break;
			}
			int vic = taula.getOrDefault(mapa, 0);
			vic++;
			taula.put(mapa, vic);

		}
		int valorMax = 5;
		String clauMax = "NO";
		for (String string : taula.keySet()) {
			if (taula.get(string) >= valorMax) {
				valorMax = taula.get(string);
				if (clauMax == "NO") {
					clauMax = string;
				}
				
			}

		}System.out.println(clauMax);
	}
}
