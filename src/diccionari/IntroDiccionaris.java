package diccionari;


import java.util.HashMap;

public class IntroDiccionaris {
	
	public static void main(String[] args) {
		
		//tenim un hashmap, a on la clau es String, i el valor, es int.
		HashMap<String,Integer> edats = new HashMap<String,Integer>();
		
		//put. Afegeix a un map una parella de clau-valor
		edats.put("Arnau", 18);
		edats.put("Albert", 21);
		edats.put("Juli",18);
		edats.put("Adri",27);
		edats.put("Kernel",2);
		edats.put("Gregorio",54);
		edats.put("Novia de l'Albert",24);
		
		
		
		
		//printar un map
		System.out.println(edats);
		
		//get. Obte un valor.
		//getOrDefault. Obte un valor. Si no troba la clau torna el default
		int edatArnau = edats.getOrDefault("Arnau", -1);
		System.out.println("Arnau te "+edatArnau+" anys");
		
		int edatMarc = edats.getOrDefault("Marc", -1);
		System.out.println("Marc te "+edatMarc+" anys");
		
		//remove. Esborra un valor. Retorna el valor de l'entrada que ha esborrat
		edats.remove("Albert");
		//remove. Esborra un valor si t el que li has passat. Retorna true si ha borrat, false si no.
		edats.remove("Kernel", 1);

		System.out.println(edats);
		
		//contains. Hi ha contains de clau i de valor
		System.out.println(edats.containsKey("Kernel"));
		System.out.println(edats.containsValue(5));
		
		//editar un mapa
		//si en un put en comtpes de posar una clau nova, poso una clau ja existent, el que far s modificarla
		edats.put("Kernel", 3);
		//tamb es pot fer servir el replace. En aquest cas el replace si no troba el valor no afegir un de nou.
		edats.replace("Albert", 21);
		System.out.println(edats);
		//replace. Nomes et canvia si el valor antic es l'especificat.
		edats.replace("Arnau", 18, 19);
		//putIfAbsent. Noms el posa si no existeix. Si existeix, NO el modifica.
		edats.putIfAbsent("Arnauºº", 22);
		
		
		
		
		
		
		
		
		
		
		//TreeMap diccionarit = new TreeMap();
		
		
	}

}
