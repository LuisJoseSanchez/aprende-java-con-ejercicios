/**
 * @author Luis José Sánchez
 *
 * Ejemplo de uso de arrays
 */
public class Array02v2 {
  public static void main(String[] args) {
        
    // definición del array y reserva de memoria en la misma línea
    int[] x = {8, 33, 200, 150, 11};

    System.out.println("El array x tiene 5 elementos ¿cuál de ellos quiere ver?");
    System.out.print("Introduzca un número del 0 al 4: ");
    int indice = Integer.parseInt(System.console().readLine());
    System.out.print("El elemento que se encuentra en la posición " + indice);
    System.out.println(" es el " + x[indice]);
  }
}
