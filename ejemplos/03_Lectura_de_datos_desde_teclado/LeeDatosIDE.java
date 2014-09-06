/**
* Lectura de datos desde teclado
* Para IDEs como Eclipse, Netbeans o JavaEdit
*
* @author Luis J. Sánchez
*/

import java.util.Scanner;

public class LeeDatosIDE {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce tu nombre: ");
    String nombre = s.nextLine();
    
    System.out.print("Introduce tu edad: ");
    int edad = Integer.parseInt(s.nextLine());
    
    System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
  }
}
