/**
 * 
 * 5. Bucles
 * 
 * 22. Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Luis José Sánchez
 * 
 */

public class S05Ejercicio22 {

	public static void main(String[] args) {
		
		boolean esPrimo = true;
        int n, i;
        
        System.out.print("Números primos entre 2 y 100: ");
        
        for (n = 2; n <= 100; n++) {
        	
        	esPrimo = true;
			for (i = 2; i < n; i++)
				if (n%i == 0) esPrimo = false;
				
			if (esPrimo)	System.out.print(n + " ");
		}
		System.out.println();
	}
}
