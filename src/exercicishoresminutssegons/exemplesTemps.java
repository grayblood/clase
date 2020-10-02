package exercicishoresminutssegons;

import java.util.Scanner;

public class exemplesTemps {
	
	//Bluzzard treur LightLand el 27/10 a les 12:30. Calcula si ha sortit Lightland o encara no
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mes = sc.nextInt();
		int dia = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		
		if(mes<10) {
			System.out.println("No ha sortit");
		}else if (mes > 10) {
			System.out.println("Si ha sortit");
		}else if (mes == 10) {
			//el mes es octubre, s'ha de consultar el dia
			if(dia<27) {
				System.out.println("No ha sortit");
			}else if(dia>27) {
				System.out.println("Si ha sortit");
			}else if(dia == 27) {
				//el dia es 27, s'ha de consultar les hores
				if(h<12) {
					System.out.println("No ha sortit");
				}else if(h>12) {
					System.out.println("Si ha sortit");
				}else if(h == 12) {
					if(m<30) {
						System.out.println("No ha sortit");
					}else {
						//no importa si es 30 o mes gran que 30 perque surt just a i 30.
						System.out.println("Si ha sortit");
					}
				}
			}
		}
		
		
		
		
	}
	
	

}
