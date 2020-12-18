package diccionari;

import java.util.HashMap;
import java.util.TreeMap;

public class RecorrerDiccionari {
	
	public static void main(String[] args) {
		
		//treeMap. Et mant la llista de claus ordenades. Noms t sentit si recorres el diccionari.
		TreeMap<String,String> aficions = new TreeMap<String,String>();
		
		aficions.put("Arnau", "Nadar");
		aficions.put("Albert","Menjar Allioli");
		aficions.put("Juli","Anar amb Sandalies");
		aficions.put("Angel","patos");
		aficions.put("Kernel","Jutjarme");
		
		//per recorrer un diccionari recorrerem per clau
		//les claus tornen un set. Es un set perque les claus no es poden repetir
		for (String nom : aficions.keySet()) {
			System.out.println(nom+" te d'aficio "+aficions.getOrDefault(nom, "Sentir buit existencial"));
		}
		
		System.out.println(aficions);

	}

}
