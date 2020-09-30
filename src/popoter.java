

	import java.util.Scanner;

	public class popoter {
		private static Scanner sc;

		public static void main(String[] args) {
			
			sc = new Scanner(System.in);
			
			String barret = sc.nextLine();
			
			switch(barret) {
			case "Coratge":

				System.out.println("Gryffindor");
				break;
			case "Coneixement":
				System.out.println("Ravenclaw");
				break;
			case "Ambicio":
				System.out.println("Slytherin");
				break;

			default:
				System.out.println("Hufflepuff");
			
			
			}
			
			
		}

	}
