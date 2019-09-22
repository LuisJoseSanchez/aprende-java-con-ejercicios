import java.util.Scanner;

/**
 * Lectura de datos desde teclado usando la clase Scanner
 *
 * @author Luis J. Sánchez
 */
public class LeeDatosScanner01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce tu nombre: ");
    String nombre = s.nextLine();
    
    System.out.print("Introduce tu edad: ");
    int edad = Integer.parseInt(s.nextLine());
    
    System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
  }
}
