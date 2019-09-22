import java.util.ArrayList;

/**
 * Ejemplo de uso de la clase ArrayList.
 * Borrado de elementos con removeIf().
 * 
 * @author Luis José Sánchez
 */
public class EjemploArrayList067 {
  public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<Integer>();

    a.add(20);
    a.add(7);
    a.add(14);
    a.add(32);
    a.add(3);

    System.out.println("Contenido de la lista: ");
    System.out.println(a);

    a.removeIf(numero -> numero < 10);

    System.out.println("Contenido de la lista después de borrar los menores de 10: ");
    System.out.println(a);

  }
}
