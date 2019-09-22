/**
 * Generación de números aleatorios.
 *
 *  @author Luis José Sánchez
 */
public class Aleatorio01 {
  public static void main(String[] args) {
    System.out.println("Diez números aleatorios:\n");

    for (int i = 1; i < 11; i++) {
      System.out.println(Math.random());
    }
  }
}
