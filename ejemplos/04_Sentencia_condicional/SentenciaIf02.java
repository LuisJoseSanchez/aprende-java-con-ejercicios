/**
 * Sentencia if
 *
 * @author Luis J. Sánchez
 */
public class SentenciaIf02 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un número entero: ");
    String linea = System.console().readLine();
    int x = Integer.parseInt(linea);

    if (x < 0) {
      System.out.println("El número introducido es negativo.");
    } else {
      System.out.println("El número introducido es positivo.");
    }
  }
}
