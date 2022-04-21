/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 6. Números aleatorios.
 * 
 * Ejercicio 25
 * 
 * @author Luis José Sánchez
 */
public class S06Ejercicio25 {
  public static void main(String[] args) {

    for (int i = 0; i < 100; i++) {
      int numero = (int)(Math.random() * 191) + 10;

      // Comprueba si el número es primo
      boolean esPrimo = true;
      for (int j = 2; j < numero; j++) {
        if ((numero % j) == 0) {
          esPrimo = false;
        }
      }
      
      if (esPrimo) {
        System.out.print("#" + numero + "#  ");
      } else if ((numero % 5) == 0) {// múltiplo de 5
        System.out.print("[" + numero + "]  ");
      } else {
        System.out.print(numero + "  ");
      }
    } // for
  }
}
