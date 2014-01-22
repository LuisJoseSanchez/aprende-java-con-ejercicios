/**
 * 
 * 5. Bucles
 * 
 * 12. Escribe un programa que muestre los n primeros términos de la
 *     serie de Fibonacci. El primer término de la serie de Fibonacci
 *     es 0, el segundo es 1 y el resto se calcula sumando los dos
 *     anteriores, por lo que tendríamos que los términos son 0, 1, 1,
 *     2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
 *     introducir por teclado.
 * 
 * @author Luis José Sánchez
 * 
 */

public class S05Ejercicio12 {

	public static void main(String[] args) {
		
        int i = 1, f1 = 0, f2 = 1, aux;

        System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
        System.out.print("Por favor, introduzca n: ");
        int n = Integer.parseInt(System.console().readLine());

        switch (n) {
            case 1:     System.out.print("0"); break;
            case 2:     System.out.print("0 1"); break;
            default:    System.out.print("0 1");
                        while(n > 2) {
                            aux = f1;
                            f1 = f2;
                            f2 = aux + f2;
                            System.out.print(" " + f2);
                            n--;
                        }
        }
        
        System.out.println();
	}
}
