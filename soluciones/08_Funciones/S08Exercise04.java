/**
 * 
 * 8. Funciones
 * 
 * 4. Escribe un programa que pase de binario a decimal.
 * 
 * @author Luis José Sánchez
 * 
 */
 
import matematicas.*;

public class S08Exercise04 {

	public static void main(String[] args) {

		long decimal = 0;
		
		System.out.print("Introduzca un número binario: ");
		long binario = Long.parseLong(System.console().readLine());
		
		int bits = matematicas.Varias.digitos(binario);
		
		for(int i = 0; i < bits; i++)
			decimal += matematicas.Varias.digitoN(binario, bits - i - 1) * matematicas.Varias.potencia(2, i);
			
		System.out.println(binario + " en binario es " + decimal + " en decimal.");
    }
}
