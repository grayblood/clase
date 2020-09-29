
public class ModulsIOperadorsLlogics {
	
	public static void main(String[] args) {
		
		int a = 9;
		int b = 5;
		int c = 9/5;
		
		System.out.println("El resultat es "+c);
		
		//modul. % que et diu el residu de la divisio
		
		int modul = 9%5;
		
		System.out.println("El modul es "+modul);
		
		
		//el modul serveix per veure si un numero es divisible
		int parell = 879872;
		int modulparell = parell%7;
		System.out.println("El modulparell es "+modulparell);
		
		
		//operadors llogics. Funcionen sobre booleans.
		
		boolean julisuspes = true;
		boolean angelaprovat = false;
		
		//operador OR. Retorna true si el primer O el segon operand es tru
		boolean gatete = julisuspes || angelaprovat; //seria true
		
		//operador AND. Retorna true si el primer I el segon son true;
		boolean pollastre = julisuspes && angelaprovat; //seria false
		
		
		
		
	}

}
