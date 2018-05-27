/**
 * 
 * 8. Funciones
 * 
 * Ejercicios 29-34
 * 
 * @author Luis José Sánchez
 * 
 */
 
import array.ArrayBi;

public class S08Ejercicio29a34 {

  public static void main(String[] args) {
    
    int[][] a = array.ArrayBi.generaArrayBiInt(5, 8, 0, 100);
    
    array.ArrayBi.muestraArrayBiInt(a);
    System.out.print("\nFila 2: ");
    array.Array.muestraArrayInt(array.ArrayBi.filaDeArrayBiInt(a, 2));
    System.out.print("\nColumna 6: ");
    array.Array.muestraArrayInt(array.ArrayBi.columnaDeArrayBiInt(a, 6));
    System.out.print("\nCoordenadas del 24 (fila, columna): ");
    array.Array.muestraArrayInt(array.ArrayBi.coordenadasEnArrayBiInt(a, 24));
    
    int[][] b = {{11, 10, 9}, {4, 5, 7}, {2, 6, 1}};
    array.ArrayBi.muestraArrayBiInt(b);
    System.out.println("\nBusca los puntos de silla: ");
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        if (array.ArrayBi.esPuntoDeSilla(b, i, j)) {
          System.out.println("fila " + i + ", columna " + j + " -> "  + b[i][j]);
        }
      } // for j
    } // for i
    array.ArrayBi.muestraArrayBiInt(a);
    System.out.print("\nFila: ");
    int fila = Integer.parseInt(System.console().readLine());
    System.out.print("Columna: ");
    int columna = Integer.parseInt(System.console().readLine());
    System.out.print("Dirección (nose/neso): ");
    String direccion = System.console().readLine();
    System.out.print("\nDiagonal: ");
    array.Array.muestraArrayInt(array.ArrayBi.diagonal(a, fila, columna, direccion));
  }

}
