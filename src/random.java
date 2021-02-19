import java.util.Random;

public class random {
	public static void main(String[] args) {

		int f = 6;
		int c = 3;
		int res = f * c;
		int res2 = res  / 4;
		int res3 = res  / 2;
		System.out.println(res2 + " " + res + " " + res3);
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int res4 = r.nextInt(res3) + res2;
			System.out.println(res4);
		}System.out.println();
		int res4 = r.nextInt(res3) + res2;
		System.out.println(res4);

	}
}
