/**
 * 
 * 6. Números aleatorios
 * 
 * 12. Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el
 *     código ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un
 *     entero en un carácter.
 *
 * @author Luis José Sánchez
 * 
 */

public class S06Ejercicio12 {

	public static void main(String[] args) {

		for(int i = 0; i < 4000; i++)
			System.out.print((char)(Math.random() * ((126 - 32 + 1) + 32)));

		System.out.println();
	}
}
