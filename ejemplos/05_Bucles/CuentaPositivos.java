/**
 *
 * Bucle while que termina cuando se introduce por teclado un
 * número negativo.
 *
 * @author Luis José Sánchez
 *
 */

public class CuentaPositivos {
    
	public static void main(String[] args) {
        
        int numeroIntroducido = 0, cuentaNumeros = 0, suma = 0;
        
        System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
        System.out.println("Para terminar, introduzca un número negativo.");
        
        while (numeroIntroducido >= 0) {
			numeroIntroducido = Integer.parseInt(System.console().readLine());
			cuentaNumeros++; // Incrementa en uno la variable
							 // Es equivalente a cuentaNumeros = cuentaNumeros + 1
			suma += numeroIntroducido; // Equivale a suma = suma + NumeroIntroducido
		}
		
		System.out.println("Has introducido " + (cuentaNumeros - 1) + " números positivos.");
		System.out.println("La suma total de ellos es " + (suma - numeroIntroducido));

    }
}
