import java.util.Scanner;

public class veri {

	private static Scanner lector2;

	public static void main(String[] args) {

		lector2 = new Scanner(System.in);

		int veg = lector2.nextInt();
		for (int i = 0; i < veg; i++) {
			int hp = lector2.nextInt();
			int ram = lector2.nextInt();
			int twitch = lector2.nextInt();
			int n = 0;
			boolean Flag = false;
			if (hp > 0 && ram > 0 && twitch > 0) {

				do {
					n++;
					if (hp > 0) {
						hp = hp - ram;

						Flag = false;

					}
					if (hp > 0) {
						hp = hp - twitch;

						Flag = true;

					}


				} while (hp > 0);
				if (Flag == false) {
					System.out.println("RAMMUS " + n);
				} else if (Flag == true) {
					System.out.println("TWITCH " + n);
				}
			} // if 1

		}
	}
}
