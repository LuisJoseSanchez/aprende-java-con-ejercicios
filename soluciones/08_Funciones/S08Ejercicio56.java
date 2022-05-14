import array.ArrayBi;

public class S08Ejercicio56 {

  public static void main(String[] args) {
    int[][] a = {
      {45, 92, 14, 20, 25, 78},
      {35, 72, 24, 45, 42, 60},
      {32, 42, 64, 23, 41, 39},
      {98, 45, 94, 11, 18, 48}
    };
    
    ArrayBi.muestraArrayBiInt(a);
    
    System.out.print("\ncorteza: ");
    
    for (int numero : corteza(a)) {
      System.out.print(numero + " ");
    }
  }

  private static int[] corteza(int[][] n) {
    int filas = n.length;
    int columnas = n[0].length;
    
    int[] resultado = new int[2 * filas + 2 * columnas - 4];
    
    int j = 0;
    
    // Fila superior
    for (int i = 0; i < columnas - 1; i++) {
      resultado[j++] = n[0][i];
    }
    
    // Columna derecha
    for (int i = 0; i < filas - 1; i++) {
      resultado[j++] = n[i][columnas - 1];
    }
    
    // Fila inferior
    for (int i = columnas - 1; i > 0; i--) {
      resultado[j++] = n[filas - 1][i];
    }
    
    // Columna izquierda
    for (int i = filas - 1; i > 0; i--) {
      resultado[j++] = n[i][0];
    }
    return resultado;
  }
  
}
