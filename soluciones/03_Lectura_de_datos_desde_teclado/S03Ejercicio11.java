/**
 * 3. Lectura de datos desde teclado
 *
 * 11. Realiza un conversor de Kb a Mb.
 *
 * @author Luis José Sánchez
 */
public class S03Ejercicio11 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca el número de Kb: ");
    double kb = Double.parseDouble(System.console().readLine());
    System.out.println(kb + "Kb son " +  (kb / 1024) + "Mb");
  }
}
