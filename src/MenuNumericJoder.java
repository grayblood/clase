
import java.util.Scanner;

public class MenuNumericJoder {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//flag de sortida
		boolean sortir = false;
		
		//variables FORA del bucle. Volem que es guardin
		int ini = -1;
		int fin = -1;
		
		
		//menu: Switch dintre d'un while
		
		while(sortir == false) {
			//System.out.println("DIGUES OPCIO");
			String opcio = sc.nextLine();
			
			switch(opcio) {
			case "A":
				//System.out.println("Introdueix nombre inicial");
				ini = sc.nextInt();
				sc.nextLine();
				break;
			case "B":
				//System.out.println("Introdueix nombre final");
				fin = sc.nextInt();
				sc.nextLine();
				break;
			case "C":
				if(ini == -1 || fin == -1 ) {
					System.out.println("ERROR"); //nombre no inicialitzat
				}else if(fin<ini) {
					System.out.println("ERROR"); //final mes petit que inicial
				}
				else {
					for (int i = ini; i <= fin; i++) { //for que comença ini i acaba a fin incloent ambdos.
						System.out.println(i); //recorres el bucle
					}
				}
				break;
			case "D":
				System.out.println("BYE");
				sortir = true;
				break;
			}
		}
		
	}

}