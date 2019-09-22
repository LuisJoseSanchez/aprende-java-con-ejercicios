/**
 * Dice si un número es o no es primo usando una función
 * 
 * @author Luis José Sánchez
 */
public class NumeroPrimoConFuncion {
  
  // Programa principal //////////////////////////////////////
  
  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero positivo: ");
    int n = Integer.parseInt(System.console().readLine());
  
    if (esPrimo(n)) {
      System.out.println("El " + n + " es primo.");
    } else {
      System.out.println("El " + n + " no es primo.");
    }
  }
  
  // Funciones ///////////////////////////////////////////////
  
  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return  <code>true</code> si el número es primo
   * @return  <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    
    return true;
  }
}
