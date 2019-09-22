package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Luis José Sánchez
 */
public class Varias {

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

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return  la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }
}
