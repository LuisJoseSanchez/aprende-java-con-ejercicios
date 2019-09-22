import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo de uso de la clase HashMap
 * 
 * @author Luis José Sánchez
 */
public class EjemploHashMap02 {
  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.println("Todas las entradas del diccionario extraídas con entrySet:");
    System.out.println(m.entrySet());

    System.out.println("\nEntradas del diccionario extraídas una a una:");
    for (Map.Entry pareja: m.entrySet()) {
      System.out.println(pareja);
    }    
  }
}
