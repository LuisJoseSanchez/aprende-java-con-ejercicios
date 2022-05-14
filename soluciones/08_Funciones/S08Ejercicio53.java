public class S08Ejercicio53 {

  public static void main(String[] args) {
    int[][] array = new int[4][6];
    int fila;
    int columna;

    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 6; columna++) {
        array[fila][columna] = (int) (Math.random() * 201);
        System.out.printf("%3d ", array[fila][columna]);
      }
      System.out.println("");
    }
    System.out.println("\n3 -> " + nEsimo(array, 3));
    System.out.println("20 -> " + nEsimo(array, 20));
    System.out.println("24 -> " + nEsimo(array, 24));
    System.out.println("23 -> " + nEsimo(array, 23));
  }

  public static int nEsimo(int[][] n, int posicion) {
  int filas = n.length;
    int columnas = n[0].length;
    
    if ((posicion < 0) || (posicion > filas * columnas - 1)) {
      return -1;
    } else {
    return n[posicion / columnas][posicion % columnas];
    }
  }
}
