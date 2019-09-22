import java.util.ArrayList;

/**
 * Uso de un ArrayList de objetos
 * 
 * @author Luis José Sánchez
 */
public class EjemploArrayList07 {
  public static void main(String[] args) {

    ArrayList<Gato> g = new ArrayList<Gato>();

    g.add(new Gato("Garfield", "naranja", "mestizo"));
    g.add(new Gato("Pepe", "gris", "angora"));
    g.add(new Gato("Mauri", "blanco", "manx"));
    g.add(new Gato("Ulises", "marrón", "persa"));

    System.out.println("\nDatos de los gatos:\n");

    for (Gato gatoAux: g) {
      System.out.println(g);
    }
  }
}
