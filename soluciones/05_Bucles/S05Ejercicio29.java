/**
 * 5. Bucles
 * 
 * 29. Escribe un programa que muestre por pantalla  todos  los números enteros positivos menores
 *     a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio29 {

  public static void main(String[] args) {

    System.out.print("Introduzca un número entero positivo (relativamente grande): ");
    int numeroGrande = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca otro número (relativamente pequeño): ");
    int numeroPequeno = Integer.parseInt(System.console().readLine());

    System.out.print("Los números enteros positivos menores que " + numeroGrande );
    System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");

    int cuenta = 0;
    int suma = 0;

    for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeno) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
