/**
 * 2. Variables
 *
 * 1. Escribe un programa en el que se declaren las variables enteras x
 *    e y. Asignales los valores 144 y 999 respectivamente. A continuación,
 *    muestra por pantalla el valor de cada variable, la suma, la resta,
 *    la división y la multiplicación.
 *
 * @author Luis José Sánchez
 */
public class S02Ejercicio01 {
  public static void main(String[] args) {
    int x = 144;
    int y = 999;
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x / y = " + ((float)x / (float)y));
    System.out.println("x * y = " + (x * y));
  }
}
