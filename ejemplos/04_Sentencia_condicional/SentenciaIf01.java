/**
 * Sentencia if
 *
 * @author Luis J. Sánchez
 */
public class SentenciaIf01 {
  public static void main(String[] args) {   
    System.out.print("¿Cuál es la capital de Kiribati? ");
    String respuesta = System.console().readLine();
  
    if (respuesta.equals("Tarawa")) {
      System.out.println("¡La respuesta es correcta!");
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }
  }
}
