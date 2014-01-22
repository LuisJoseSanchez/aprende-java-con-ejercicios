/**
 * 
 * 5. Bucles
 * 
 * 28. Escribe  un  programa que calcule el factorial de un  número
 *     entero leído por teclado.
 * 
 * @author Luis José Sánchez
 * 
 */

public class S05Ejercicio28 {

	public static void main(String[] args) {
		
		int numeroIntroducido;
		
		// Lee un número mayor o igual que 0
		do {
			System.out.print("Introduzca un número entero mayor o igual que 0: ");
			numeroIntroducido = Integer.parseInt(System.console().readLine());
			if (numeroIntroducido < 0)
				System.out.println("El número introducido no es correcto.");
		} while (numeroIntroducido < 0);

		int factorial = numeroIntroducido;
		
		if (numeroIntroducido == 0)
				System.out.println("El factorial del " + numeroIntroducido + " es 1.");
			else {
				for (int i = 1; i < numeroIntroducido; i++)
					factorial *= i;
					
				System.out.println("El factorial del " + numeroIntroducido + " es " + factorial);
		}
	}
}
