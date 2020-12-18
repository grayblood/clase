package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dretan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int llargada = sc.nextInt();
			ArrayList<Integer> nums = new ArrayList<>();
			for (int j = 0; j < llargada; j++) {
				nums.add(sc.nextInt());
			}

			for (int j = 0; j < 1; j++) {
				int pos1 = 1;
				while (pos1 < llargada) {
					Collections.swap(nums, 0, pos1);
					pos1++;
				}
			}
			
			for (int g = 0; g < llargada; g++) {
				System.out.print(nums.get(g)+" ");
			}System.out.println();

		}
	}
