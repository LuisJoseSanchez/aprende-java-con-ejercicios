/**
 * 5. Bucles
 * 
 * 22. Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio22 {

  public static void main(String[] args) {

    System.out.print("Números primos entre 2 y 100: ");
       
    boolean esPrimo = true;
    int n;
    int i;

    for (n = 2; n <= 100; n++) {

      // comprueba si n es primo
      esPrimo = true;
      for (i = 2; i < n; i++) {
        if (n%i == 0) esPrimo = false;
      }

      // si n es primo, se muestra por pantalla
      if (esPrimo) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
  }
}
