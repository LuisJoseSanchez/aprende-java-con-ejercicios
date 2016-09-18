/**
 * Salida formateada
 *
 * @author Luis J. Sánchez
 */

public class SalidaFormateada01 {
  public static void main(String[] args) {
    System.out.printf("El número %d no tiene decimales.\n", 21);
    System.out.printf("El número %f sale con decimales.\n",  21.0);
    System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.0);
  }
}
