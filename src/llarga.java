import java.util.Scanner;

public class llarga {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int veg1 = sc.nextInt();
		sc.next();
		for (int i = 0; i < veg1; i++) {
			String s = sc.nextLine();
			String[] split = s.split(" ");
			int lla=0;
			for (int k = 0; k < split.length; k++) {
				if (split[k].length() > lla) {
					lla = split[k].length();
				}
			}System.out.println(lla);
		}
		
	}
}
