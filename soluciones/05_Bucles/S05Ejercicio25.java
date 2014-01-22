/**
 * 
 * 5. Bucles
 * 
 * 25. Realiza un programa que pida un número por teclado y que luego
 *     muestre ese número al revés.
 * 
 * @author Luis José Sánchez
 * 
 */

public class S05Ejercicio25 {

	public static void main(String[] args) {
		
		int volteado = 0, numero;
		
        System.out.print("Introduzca un número entero: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());

        numero = numeroIntroducido;
		while (numero > 0) {
			volteado = (volteado * 10) + (numero % 10);
			numero /= 10;
		} // while
		
		System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);
	}
}
