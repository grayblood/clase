import java.util.Scanner;

public class foreach {

	public static void main(String[] args) {

		String[] arrayStrings = new String[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arrayStrings.length; i++) {
			arrayStrings[i] = sc.nextLine();
		}
		
		// for(tipusDelArray i : arrayOLlista){
		for (String i : arrayStrings) {
			// aqui i, ja no es el comptador
			// aqui i equival a arrayInts[i]
			System.out.println(i);
		}

	}

}
