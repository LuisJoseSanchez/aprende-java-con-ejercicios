/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 31
 *
 * @author Luis José Sánchez
 */
public class S05Ejercicio31 {
  public static void main(String[] args) {

    System.out.print("Introduzca la altura de la L: ");
    int altura = Integer.parseInt(System.console().readLine());

    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }

    for (int i = 0; i < altura / 2 + 1; i++) {
      System.out.print("* ");
    }

  }
}
