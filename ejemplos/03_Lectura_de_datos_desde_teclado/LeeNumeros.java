/**
* Lectura de datos desde teclado
*
* @author Luis J. Sánchez
*/

public class LeeNumeros {
	public static void main(String[] args) {
		int x, y, total;
		String linea;

		System.out.print("Por favor, introduce un número: ");
		//linea = System.console().readLine();
		x = System.console().readLine();
		//x = Integer.parseInt( linea );

		System.out.print("introduce otro, por favor: ");
		linea = System.console().readLine();
		y = Integer.parseInt( linea );

		total = (2 * x) + y;

		System.out.print("El primer número introducido es " + x);
		System.out.println(" y el segundo es " + y);
		System.out.print("El doble del primer número por el segundo es ");
		System.out.print(total); 	
	} 
}
