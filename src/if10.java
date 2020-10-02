import java.util.Scanner;

public class if10 {
	static Scanner lector;
	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int n = lector.nextInt();
		int res = 0;
		if (n % 1 == 0) {
			if (n % 2 == 0) {
				if (n % 3 == 0) {
					if (n % 4 == 0) {
						if (n % 5 == 0) {
							if (n % 6 == 0) {
								if (n % 7 == 0) {
									if (n % 8 == 0) {
										if (n % 9 == 0) {
											System.out.println("SI");
										}
										else {
											System.out.println("NO");
										}
									}
									else {
										System.out.println("NO");
									}
								}	
								else {
									System.out.println("NO");
								}
							}
							else {
								System.out.println("NO");
							}	
						}
						else {
							System.out.println("NO");
						}	
					}	
				}
				else {
					System.out.println("NO");
				}
				
			}
		}
		else {
			System.out.println("NO");
		}
		
		
	}
}
