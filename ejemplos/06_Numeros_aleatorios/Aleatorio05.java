/**
 * Generación de números aleatorios.
 *
 * @author Luis José Sánchez
 */
public class Aleatorio05 {
  public static void main(String[] args) {
    System.out.println("20 números aleatorios entre 50 y 60 (sin decimales):");
    
    for (int i = 1; i <= 500; i++) {
      System.out.print(((int)(Math.random()*43) + -5 ) + "  ");
    }

    System.out.println();
  }
}
