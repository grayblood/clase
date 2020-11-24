package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class array2 {
	
	public static void main(String[] args) {
		
		
		//aqui esta la forma d'inicialitzar una llista en una sola linea
				ArrayList<Integer> llistaInt = new ArrayList<Integer>(Arrays.asList(324,69,7,-84,69,420,666,-34,42,1));
				ArrayList<String> llistaStr = new ArrayList<String>(Arrays.asList("azucar","darksouls","aaaasupremaciaracial","dormir","avena","soyunfurrouwu","esternocleidomastoideo","oppais","onlyfans","si"));
				System.out.println(llistaInt);
				System.out.println(llistaStr);
				Scanner sc = new Scanner(System.in);
				
				//veure si una llista cont un element
				System.out.println("Digues la paraula que vols buscar");
				String s = sc.nextLine();
				boolean conte = llistaStr.contains(s);
				if(conte) {
					System.out.println("La paraula existeix");
				}else {
					System.out.println("la paraula no existeix");
				}
				
				//veure quants elements hi ha en una llista
				int numElements = Collections.frequency(llistaInt, 543543);
				System.out.println("hi ha tants elements: "+numElements);
				
				//veure a quina posici esta un element a la llista
				llistaStr.add("uwu");
				llistaStr.add("uwu");
				llistaStr.add("uwu");
				llistaStr.add("uwu");
				llistaStr.add("uwu");
				llistaStr.add("uwu");
				//si no el troba torna -1
				int index = llistaStr.indexOf("uwu");
				System.out.println("primer uwu "+index);
				//si vols buscar l'ultim i no el primer
				int lastindex = llistaStr.lastIndexOf("uwu");
				System.out.println("ultim uwu "+lastindex);
				
				//buscar les posicions de tots els uwus
				ArrayList<Integer> llistaposicions = new ArrayList<Integer>();
				for (int i = 0; i < llistaStr.size(); i++) {
					//AAAAH!!! HI HAURA UN EXERCICI DEL JODER SOBRE AIXO EN BREU
					
				}
				
				
				//maxim i minim
				int max = Collections.max(llistaInt);
				System.out.println("el maxim de la llista d'enters es "+max);
				int min = Collections.min(llistaInt);
				System.out.println("el minim de la llista d'enters es "+min);
				
				String maxS = Collections.max(llistaStr);
				System.out.println("el maxim de la llista String es "+maxS);
				String minS = Collections.min(llistaStr);
				System.out.println("el minim de la llista String es "+minS);
				
				
	}

}
