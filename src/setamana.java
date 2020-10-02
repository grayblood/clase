import java.util.Scanner;

public class setamana {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		String setmana = sc.nextLine();
		
		switch(setmana) {
		case "1":

		case "2":

		case "3":

		case "4":
			System.out.println("Suspes");
			break;
		case "5":

		case "6":
			System.out.println("Aprovat");
			break;
		case "7":
		case "8":
			System.out.println("Notable");
			break;
		case "9":

		case "10":
			System.out.println("Excelent");
			break;

		default:
			System.out.println("Eso no es posible");
		
		
		}
		
		
	}
}
