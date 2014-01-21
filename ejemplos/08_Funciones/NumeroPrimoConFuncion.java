public class NumeroPrimoConFuncion {
	
	// Programa principal //////////////////////////////////////
	
	public static void main(String[] args) {
		
		System.out.print("Introduzca un número entero positivo: ");
		int n = Integer.parseInt(System.console().readLine());
	
		if (esPrimo(n))
			System.out.println("El " + n + " es primo.");
		else
			System.out.println("El " + n + " no es primo.");
	}
	
	// Funciones ///////////////////////////////////////////////
	
	static boolean esPrimo(int x) {
		
		boolean esPri = true;
		
		for (int i = 2; i < x; i++)
			if ((x % i) == 0) esPri = false;
		
		return esPri;	
	}
}
