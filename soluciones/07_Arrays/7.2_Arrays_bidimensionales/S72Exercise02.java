/**
 * 7.2 Arrays bidimensionales
 * 
 * 2. Escribe un programa que pida 20 números enteros.
 *    Estos números se deben introducir en un array de 4 filas por 5 columnas.
 *    El programa mostrará las sumas parciales de filas y columnas igual que
 *    si de una hoja de cálculo se tratara.
 *    La suma total debe aparecer en la esquina inferior derecha.
 * 
 * @author Luis José Sánchez
 */
public class S72Exercise02 {
  public static void main(String[] args) {

    int[][] num = new int[4][5]; // array de 4 filas por 5 columnas
    
    int fila;
    int columna;
    
    // Lee los datos de teclado
    System.out.println("Por favor, introduzca los números (enteros) en el array");
    for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        num[fila][columna] = Integer.parseInt(System.console().readLine());
      }
    }
    
    System.out.println();

    // Muestra los datos y las sumas parciales de las filas
    int sumaFila;
    for(fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
      System.out.printf("|%7d\n", sumaFila);
    }
    
    // Muestra las sumas parciales de las columnas
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    int sumaColumna;
    int sumaTotal = 0;
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }

      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
    }
    System.out.printf("|%7d   ", sumaTotal);
  }
}
