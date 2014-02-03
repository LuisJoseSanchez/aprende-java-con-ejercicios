/**
 * 
 * 8. Funciones
 * 
 * 3. Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author Luis José Sánchez
 * 
 */
 
import matematicas.*;

public class S08Exercise03 {

	public static void main(String[] args) {

		for(int i = 1; i < 99999; i++)
			if (matematicas.Varias.esCapicua(i))
				System.out.print(i + "  ");
    }
}
