
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EditarLlistes {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> llistaInt = new ArrayList<Integer>(Arrays.asList(324,69,7,-84,69,420,666,-34,42,1));
		ArrayList<String> llistaStr = new ArrayList<String>(Arrays.asList("azucar","darksouls","aaaasupremaciaracial","dormir","avena","soyunfurrouwu","esternocleidomastoideo","oppais","onlyfans","Si"));
		System.out.println(llistaInt);
		System.out.println(llistaStr);
		Scanner sc = new Scanner(System.in);
		
		//reemplaar un element per posici
		System.out.println("reemplao la posicio 7");
		llistaStr.set(7, "loquetuquieras");
		System.out.println(llistaStr);
		
		//intercambiar dos elements de lloc
		Collections.swap(llistaStr, 1, 2);
		System.out.println(llistaStr);
		
		//reemplaar un element per un altre
		//EXERCICI DEL JODER
		
		
		
		
	}

}
