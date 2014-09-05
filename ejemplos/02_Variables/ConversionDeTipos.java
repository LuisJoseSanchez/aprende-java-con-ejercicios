/**
 * Conversión de tipos
 *
 * @author Luis J. Sánchez
 */

public class ConversionDeTipos {
  public static void main(String[] args) {

    int x = 2;
    int y = 9;
    double division;

    division = (double)y / (double)x;
    //division = y / x; // Comenta esta línea y
                // observa la diferencia.
  
    System.out.println("El resultado de la división es " + division);   
  }
}
