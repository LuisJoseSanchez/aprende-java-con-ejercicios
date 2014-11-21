/**
 * 7.1 Arrays
 * 
 * 2. Define un array de 10 simboloes con nombre “simbolo” y asigna
 *    valores a los elementos según la siguiente tabla:
 *    Posición  0   1   2   3   4   5   6   7   8   9
 *    Valor    'a' 'x'         '@'    '  ' '+' 'Q'
 *
 *    Muestra el contenido de todos los elementos del array. ¿Qué sucede
 *    con los valores de los elementos que no han sido inicializados?
 *
 * @author Luis José Sánchez
 */
public class S71Ejercicio02 {

  public static void main(String[] args) {
    
    char[] simbolo = new char[10];
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
          
    for (int i = 0; i < 10; i++) {
      System.out.println("simbolo[" + i + "]: " + simbolo[i]);
    }
    // Se puede observar que los valores del array se inicializan automáticamente
    // al simbolo vacío.
  }
}
