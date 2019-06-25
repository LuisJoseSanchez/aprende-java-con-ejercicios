/**
 * 10. Crea un mini-diccionario español-inglés que contenga, al menos,
 *     20 palabras (con su traducción).
 *     <p>
 *     Utiliza un objeto de la clase <code>HashMap</code> para almacenar
 *     las parejas de palabras. El programa pedirá una palabra en
 *     español y dará la correspondiente traducción en inglés.
 */
import java.util.HashMap;

public class S10Ejercicio10 {
  public static void main(String[] args) {

    HashMap<String, String> m = new HashMap<String, String>();

    m.put("ordenador", "computer");
    m.put("gato", "cat");
    m.put("rojo", "red");
    m.put("árbol", "tree");
    m.put("pingüino", "penguin");
    m.put("sol", "sun");
    m.put("agua", "water");
    m.put("viento", "wind");
    m.put("siesta", "siesta");
    m.put("arriba", "up");
    m.put("ratón", "mouse");
    m.put("estadio", "arena");
    m.put("calumnia", "aspersion");
    m.put("aguacate", "avocado");
    m.put("cuerpo", "body");
    m.put("concurso", "contest");
    m.put("cena", "dinner");
    m.put("salida", "exit");
    m.put("lenteja", "lentil");
    m.put("cacerola", "pan");
    m.put("pastel", "pie");
    m.put("membrillo", "quince");

    System.out.print("Introduzca una palabra en español: ");
    String palabraIntro = System.console().readLine();

    if (m.containsKey(palabraIntro)) {
      System.out.println(palabraIntro + " en inglés es " + m.get(palabraIntro));
    } else {
      System.out.print("Lo siento, no conozco esa palabra.");
    }
  }
}
