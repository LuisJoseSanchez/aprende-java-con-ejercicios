import matematicas.Varias;

/**
 * Paso de un array bidimensional como parámetro
 * 
 * @author Luis José Sánchez
 */
public class ArrayBiFunciones {
  public static void main(String[] args) {

    int[][] n = new int[6][9];

    for(int i = 0; i < 6; i++) {
      for(int j = 0; j < 9; j++) {
        n[i][j] = (int)(Math.random() * 100000);
      }
    }
    
    muestraArrayIntBi(n);
  }

  
  // Funciones ////////////////////////////////////////////////////////

  /**
   * Devuelve el número de filas de un array bidimensional de
   * números enteros.
   * 
   * @param x un array bidimensional de números enteros
   * @return  número de filas del array
   */
  public static int filasArrayIntBi(int x[][]) {
    return x.length;
  }
  
  
  /**
   * Devuelve el número de columnas de un array bidimensional
   * de números enteros.
   * 
   * @param x un array bidimensional de números enteros
   * @return  número de columnas del array
   */  
  public static int columnasArrayIntBi(int x[][]) {
    return x[0].length;
  }


  /**
   * Devuelve el máximo de un array bidimensional
   * de números enteros.
   * 
   * @param x un array bidimensional de números enteros
   * @return  el valor máximo encontrado en el array
   */  
  public static int maximoArrayIntBi(int x[][]) {
  
    int maximo = Integer.MIN_VALUE;
    
    for (int f = 0; f < filasArrayIntBi(x); f++) {
      for (int c = 0; c < columnasArrayIntBi(x); c++) {
        if (x[f][c] > maximo) {
          maximo = x[f][c];
        }
      }
    }

    return maximo;
  }


  /**
   * Muestra por pantalla el contenido de un array bidimensional
   * de números enteros.
   * 
   * @param x un array bidimensional de números enteros
   */  
  public static void muestraArrayIntBi(int x[][]) {
  
    String formatoNumero = "%" + Varias.digitos(maximoArrayIntBi(x)) + "d";

    for (int f = 0; f < filasArrayIntBi(x); f++) {
      for (int c = 0; c < columnasArrayIntBi(x); c++) {
        System.out.printf(formatoNumero + " ", x[f][c]);
      }
      System.out.println();
    }
  }
}
