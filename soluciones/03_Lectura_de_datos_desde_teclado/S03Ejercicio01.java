/**
 * 3. Lectura de datos desde teclado
 *
 * 1. Realiza un programa que pida dos números y que luego muestre el
 *    resultado de su multiplicación.
 *
 * @author Luis José Sánchez
 */
public class S03Ejercicio01 {
  public static void main(String[] args) {
    int x;
    int y;
    String linea;

    System.out.print("Por favor, introduce el primer número: ");
    linea = System.console().readLine();
    x = Integer.parseInt( linea );
    System.out.print("Introduce el segundo número: ");
    linea = System.console().readLine();
    y = Integer.parseInt( linea );
    
    System.out.println(x + "*" + y + "=" + (x * y));
  }
}
