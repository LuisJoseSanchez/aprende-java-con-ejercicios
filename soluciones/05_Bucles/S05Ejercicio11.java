/**
 * 5. Bucles
 * 
 * 11. Escribe un programa que muestre en tres columnas, el cuadrado y
 *     el cubo de los 5 primeros números enteros a partir de uno que se
 *     introduce por teclado.
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio11 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.println("   n  |    n²   |    n³");
    System.out.println("---------------------------");
    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
    }
  }
}
