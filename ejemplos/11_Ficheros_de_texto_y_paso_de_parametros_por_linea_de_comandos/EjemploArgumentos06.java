/*
 *
 * Paso de argumentos en la línea de comandos
 *
 */

class EjemploArgumentos06 {

	public static void main(String[] args) {
		
		System.out.println("Los argumentos introducidos son: ");
		for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
	}
}
