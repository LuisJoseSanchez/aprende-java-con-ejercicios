import java.util.HashMap;

/**
 * Ejemplo de uso de la clase HasMap
 *
 * @author Luis José Sánchez
 */
public class EjemploHashMap01 {
  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");      
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.println("Los elementos de m son: \n" + m);
  }
}
