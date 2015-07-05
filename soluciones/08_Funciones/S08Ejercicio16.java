/**
 * 8. Funciones
 * 
 * 16. Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author Luis José Sánchez
 */
import matematicas.Varias;

public class S08Ejercicio16 {

  public static void main(String[] args) {

    for(int i = 1; i < 99999; i++) {
      if (matematicas.Varias.esCapicua(i)) {
        System.out.print(i + "  ");
      }
    }
  }
}
