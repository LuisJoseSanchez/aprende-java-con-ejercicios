/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 33
 *
 * @author Luis José Sánchez
 */
public class S05Ejercicio33 {
  public static void main(String[] args) {

    System.out.print("Introduzca la altura de la U: ");
    int altura = Integer.parseInt(System.console().readLine());

    // Palos verticales de la U
    for (int i = 1; i < altura; i++) {
      System.out.print("* ");
      for (int j = 2; j < altura; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }

    // Base de la U
    System.out.print("  ");
    for (int i = 2; i < altura; i++) {
      System.out.print("* ");
    }

  }
}
