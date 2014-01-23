/**
 * 7.1 Arrays
 * 
 * 2. Define un array de 10 caracteres con nombre “simbolo” y asigna
 *    valores a los elementos según la siguiente tabla:
 *    Posición  0   1   2   3   4   5   6   7   8   9
 *    Valor    'a' 'x'         '@'    '  ' '+' 'Q'
 *
 *    Muestra el contenido de todos los elementos del array. ¿Qué sucede
 *    con los valores de los elementos que no han sido inicializados?
 *
 * @author Luis José Sánchez
 */

public class S71Ejercicio02 {

	public static void main(String[] args) {
		
			char[] caracter = new char[12];
			
			caracter[0] = 'a';
			caracter[1] = 'x';
			caracter[4] = '@';
			caracter[6] = ' ';
			caracter[7] = '+';
			caracter[8] = 'Q';
						
			for (int i = 1; i < 12; i++)
				System.out.println(caracter[i]);
/**
 * 
 * Se puede observar que los valores del array se inicializan
 * automáticamente al caracter vacío.
 *
 */			

	}
}
