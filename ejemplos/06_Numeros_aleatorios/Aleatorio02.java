/**
 * Generación de números aleatorios.
 *
 *  @author Luis José Sánchez
 */
public class Aleatorio02 {
  public static void main(String[] args) {
    System.out.print("20 números aleatorios entre 0 y 10");
    System.out.println(" sin llegar a 10 (con decimales):");
    
    for (int i = 1; i <= 20; i++) {
      System.out.println(Math.random() * 10 + " ");
    }
  }
}
