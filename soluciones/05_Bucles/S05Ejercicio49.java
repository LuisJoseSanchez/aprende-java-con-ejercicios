import java.util.Scanner;

/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 49
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio49 {
  
  public static void main(String[] args) {

    System.out.println("Por favor, vaya introduciendo números enteros positivos. ");
    System.out.println("Para terminar, introduzca un número primo:");

    Scanner s = new Scanner(System.in);

    int numero;
    int suma = 0;
    int cuentaNumeros = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    boolean esPrimo;

    do {
      numero = Integer.parseInt(s.nextLine());

      // comprueba si el número introducido es primo
      esPrimo = true;
      for (int i = 2; i < numero; i++) {
        if ((numero % i) == 0) {
          esPrimo = false;
        }
      }
      
      // si no es primo, se contabiliza
      if (!esPrimo) {
        suma += numero;
        cuentaNumeros++;
        
        maximo = numero > maximo ? numero : maximo;
        minimo = numero < minimo ? numero : minimo;
      }
      
    } while (!esPrimo);
    
    System.out.println("Ha introducido " + cuentaNumeros + " números no primos.");
    System.out.println("Máximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + (double)suma / cuentaNumeros);
  }
}
