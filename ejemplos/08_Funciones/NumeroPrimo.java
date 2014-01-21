public class NumeroPrimo {
	public static void main(String[] args) {
		
		System.out.print("Introduzca un número entero positivo: ");
		int n = Integer.parseInt(System.console().readLine());

		boolean esPrimo = true;
		for (int i = 2; i < n; i++)
			if ((n % i) == 0) esPrimo = false;
			
		if (esPrimo)
			System.out.println("El " + n + " es primo.");
		else
			System.out.println("El " + n + " no es primo.");
	}
}
