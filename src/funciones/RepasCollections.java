package funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RepasCollections {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> llista = new ArrayList<Integer>(Arrays.asList(3,5,3,6,8,3,3,57,83,111,5,3));
		System.out.println(llista);
		
		//ordenar la llista
		Collections.sort(llista);
		System.out.println(llista);
		//girar la llista
		Collections.reverse(llista);
		System.out.println(llista);
		
		System.out.println("maxim d'una llisat "+Collections.max(llista));
		System.out.println("minim d'una llisat "+Collections.min(llista));
		
		//omple tots els elements amb aquest numero
		Collections.fill(llista, 69);
		System.out.println(llista);
		
		//et diu quants elements iguals al posat hi ha a la llista
		System.out.println(Collections.frequency(llista, 69));
		
		
		
	}

}
