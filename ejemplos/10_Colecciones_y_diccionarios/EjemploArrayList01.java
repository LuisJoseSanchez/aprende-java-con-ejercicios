import java.util.ArrayList;

/**
 * Ejemplo de uso de la clase ArrayList
 * 
 * @author Luis José Sánchez
 */
public class EjemploArrayList01 {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    System.out.println("Nº de elementos: " + a.size());

    a.add("rojo");
    a.add("verde");
    a.add("azul");

    System.out.println("Nº de elementos: " + a.size());        

    a.add("blanco");

    System.out.println("Nº de elementos: " + a.size());        

    System.out.println("El elemento que hay en la posición 0 es " + a.get(0));        
    System.out.println("El elemento que hay en la posición 3 es " + a.get(3));        
  }
}
