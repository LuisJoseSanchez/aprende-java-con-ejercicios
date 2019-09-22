import java.util.ArrayList;

/**
 * Ejemplo de uso de la clase ArrayList.
 * Borrado de elementos con removeIf().
 * 
 * @author Luis José Sánchez
 */
public class EjemploArrayList066 {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");

    System.out.println("Contenido de la lista: ");
    System.out.println(a);

    a.removeIf(palabra -> palabra.contains("a"));

    System.out.println("Contenido de la lista después de borrar las palabras que contienen la letra \"a\": ");
    System.out.println(a);

  }
}
