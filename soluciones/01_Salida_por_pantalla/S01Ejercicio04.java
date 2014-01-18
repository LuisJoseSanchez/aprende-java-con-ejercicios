/**
 * 
 * 1. Salida por pantalla y variables
 *
 * 4. Escribe un programa que muestre tu horario de clase. Puedes usar
 *    espacios o tabuladores para alinear el texto.
 *
 * @author Luis José Sánchez
 */

public class S01Ejercicio04 {
	public static void main(String[] args) {

		String rojo = "\033[31m", verde = "\033[32m", naranja = "\033[33m";
		String azul = "\033[34m", morado = "\033[35m", celeste = "\033[36m";
		String blanco = "\033[37m";

		System.out.println(naranja + "Lunes\tMartes\tMiérc.\tJueves.\tViernes");
		System.out.println("======\t=======\t======\t======\t======");
		System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
		System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
		System.out.println(celeste + "ED" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
		System.out.println(naranja + "FOL" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
		System.out.println(naranja + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
		System.out.println(naranja + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
	}
}
