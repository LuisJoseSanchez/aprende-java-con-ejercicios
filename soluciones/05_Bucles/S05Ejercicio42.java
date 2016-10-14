/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 42
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio42 {

  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
       
    boolean esPrimo;

    for (int n = numeroIntroducido; n < numeroIntroducido + 5; n++) {

      // comprueba si n es primo
      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }

      // muestra por pantalla si n es primo o no
      if (esPrimo) {
        System.out.println(n + " es primo");
      } else {
        System.out.println(n + " no es primo");
      }
    }
    System.out.println();
  }
}
