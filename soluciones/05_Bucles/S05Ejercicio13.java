/**
 * 5. Bucles
 * 
 * 13. Escribe un programa que lea una lista de diez números y determine
 *     cuántos son positivos, y cuántos son negativos.
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca 10 números enteros: ");

    int negativos = 0;
    int positivos = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    
    System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos.");
  }
}
