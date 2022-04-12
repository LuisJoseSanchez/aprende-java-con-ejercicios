/**
 * 5. Bucles
 * 
 * 16. Escribe un programa que diga si un número introducido por teclado
 *     es o no primo. Un número primo es aquel que sólo es divisible entre
 *     él mismo y la unidad.
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio16 {

  public static void main(String[] args) {
            
    System.out.print("Introduzca un número entero y le diré si es primo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    boolean esPrimo = true;
    
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        esPrimo = false;
      }
    }
        
    if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }

    // El if anterior se puede abreviar de esta otra manera.
    // Descomenta para probarlo.
    // System.out.println("El número introducido" + (esPrimo ? "" : " no") + " es primo.");

  }
}
