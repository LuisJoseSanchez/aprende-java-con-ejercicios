/**
 * Sentencia if
 *
 * @author Luis J. Sánchez
 */
public class SentenciaIf03 {
  public static void main(String[] args) {
    System.out.print("¿Qué nota has sacado en el último examen? ");
    String line = System.console().readLine();
    double nota = Double.parseDouble( line );

    if (nota >= 5) {
      System.out.println("¡Enhorabuena!, ¡has aprobado!");
    } else {
      System.out.println("Lo siento, has suspendido.");
    }
  }
}
