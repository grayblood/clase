package array;

import java.util.ArrayList;
import java.util.Scanner;

//El primer valor correspon a la posició del palet escollit per Carlota; el segon valor correspon a la posició del palet escollit per Joana.
public class suddenly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean flag = false;
		ArrayList<Integer> pals = new ArrayList<Integer>();
		while (flag == false) {
			boolean s = false;
			while (s == false) {
				int e = sc.nextInt();
                if(e == 0) {
                    s =true;
                    break;
                }
               pals.add(e);
            }
            int joana = sc.nextInt()-1;
            int carlota = sc.nextInt()-1;
            if (pals.get(joana) > pals.get(carlota)) {
                System.out.println("JOANA");
            }else {
                System.out.println("CARLOTA");
            }
            pals.clear();
            int e = sc.nextInt();
            if(e == 0) {
                flag = true;
            }else {
                pals.add(e);
            }
        }
    }
}