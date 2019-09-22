import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo de uso de la clase HashMap
 * 
 * @author Luis José Sánchez
 */
public class EjemploHashMap03 {
  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");      
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.println("Código\tNombre\n------\t-------------");

    for (Map.Entry pareja: m.entrySet()) {
      System.out.print(pareja.getKey() + "\t");
      System.out.println(pareja.getValue());
    }
  }
}
