/**
 * @author Luis José Sánchez
 *
 * Ejemplo de uso de arrays bidimensionales
 */

public class ArrayBi02 {
  public static void main(String[] args) 
    throws InterruptedException { // Se añade esta línea para poder usar sleep
 
      int fila;
      int columna;
      int[][] n = {{20, 4}, {67, 33}, {0,7}};

      for(fila = 0; fila < 3; fila++) {

        System.out.print("Fila: " + fila);
    
        for(columna = 0; columna < 2; columna++) {
          System.out.printf("%10d ", n[fila][columna]);
          Thread.sleep(1000); // retardo de un segundo
        }
        System.out.println();    
      }
    }
}
