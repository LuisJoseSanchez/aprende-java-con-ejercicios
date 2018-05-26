/**
 * 7.1 Arrays
 * 
 * 1. Define un array de 12 números enteros con nombre num y asigna los valores
 *    según la tabla que se muestra a continuación. Muestra el contenido de todos
 *    los elementos del array. ¿Qué sucede con los valores de los elementos que
 *    no han sido inicializados?
 *    Posición  0   1   2   3   4   5   6   7   8   9   10   11
 *    Valor    39  -2           0      14       5  120
 *
 * @author Luis José Sánchez
 */
public class S71Ejercicio01 {

  public static void main(String[] args) {
    
      int[] num = new int[12];
      
      num[0] = 39;
      num[1] = -2;
      num[4] = 0;
      num[6] = 14;
      num[8] = 5;
      num[9] = 120;
            
      for (int i = 0; i < 12; i++) {
        System.out.printf("num[%2d]: %d\n", i, num[i]);
      }
      
  // Se puede observar que los valores del array se inicializan automáticamente a 0.
  }
}
