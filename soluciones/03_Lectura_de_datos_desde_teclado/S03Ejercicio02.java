/**
 * 3. Lectura de datos desde teclado
 * 
 * 2. Realiza un conversor de euros a pesetas. La cantidad de euros que
 *    se quiere convertir debe ser introducida por teclado.
 *
 * @author Luis José Sánchez
 */
public class S03Ejercicio02 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce la cantidad de euros que quieres convertir: ");
    double euros = Double.parseDouble(System.console().readLine());

    int pesetas = (int) (euros * 166.386);
    
    System.out.print(euros + " euros son " + pesetas + " pesetas.");
  }
}
