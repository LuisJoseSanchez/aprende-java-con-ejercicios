/**
 * 4. Sentencia Condicional
 *
 * 6. Realiza un programa que calcule el tiempo que tardará en caer un
 *    objeto desde una altura h.
 *    t = raiz(2h/g) siendo g = 9.81 m/s2
 *
 * @author Luis José Sánchez
 */
public class S04Ejercicio06 {
  public static void main(String[] args) {

    System.out.println("Cálculo del tiempo de caída de un objeto.");
    System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());

    final double g = 9.81; // las constantes se declaran con final
    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
  }
}
