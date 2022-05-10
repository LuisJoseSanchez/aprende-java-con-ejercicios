/**
 * 8. Funciones
 *
 * 15. Muestra los números primos que hay entre 1 y 1000.
 *
 * @author Luis José Sánchez
 */
import matematicas.Varias;

public class S08Ejercicio15 {

  public static void main(String[] args) {

    for(int i = 1; i < 1001; i++) {
      if (Varias.esPrimo(i)) {
        System.out.print(i + "  ");
      }
    }
  }
}
