/**
 * 11. Realiza un programa que escoja al azar 5 palabras en español del
 *     minidiccionario del ejercicio anterior. El programa irá pidiendo
 *     que el usuario teclee la traducción al inglés de cada una de las
 *     palabras y comprobará si son correctas. Al final, el programa
 *     deberá mostrar cuántas respuestas son válidas y cuántas erróneas.
 *    
 *    @author Luis José Sánchez
 */
import java.util.HashMap;
import java.util.ArrayList;

public class S10Ejercicio11 {
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

    int i = 0;
    int numero;

    // guarda las claves en un Array de String
    String[] a = m.keySet().toArray(new String[0]);

    // genera 5 números aleatorios que no se repiten
    ArrayList<Integer> n = new ArrayList<Integer>();
    n.add((int)(Math.random()*22));

    for (i = 0; i < 4; i++) {
      do {
        numero = (int)(Math.random()*22);
      } while (n.contains(numero));
      n.add(numero);
    }

    // muestra las palabras en español y pregunta por su traducción
    int puntos = 0;
    System.out.println("Mostraré la palabra en español y usted tendrá que traducirla al inglés.");
    for (i = 0; i < 5; i++) {
      System.out.print(a[n.get(i)] + ": ");
      String palabraIntro = System.console().readLine();
      if (palabraIntro.equals(m.get(a[n.get(i)]))) {
        System.out.println("¡Correcto!");
        puntos++;
      } else {
        System.out.println("Respuesta incorrecta :(");
        System.out.println("La respuesta correcta es " + m.get(a[n.get(i)]));
      }
    }

    System.out.println("Ha obtenido " + puntos + " puntos.");
  }
}
