/**
 * 
 * 8. Funciones
 * 
 * 2. Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author Luis José Sánchez
 * 
 */
 
import matematicas.*;

public class S08Exercise02 {

	public static void main(String[] args) {

		for(int i = 1; i < 1001; i++)
			if (matematicas.Varias.esPrimo(i))
				System.out.print(i + "  ");
    }
}
