package array;

public class Array {

  /**
   * Muestra por pantalla todos los elementos de un array de números enteros
   * separados por un espacio.
   * 
   * @param x array unidimiensional de números enteros
   */
  public static void muestraArrayInt(int x[]) {
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + " ");
    }
    System.out.println();
  }

  /**
   * Crea un array y lo rellena con valores aleatorios dentro de un rango.
   * <p>
   * Por ejemplo, generaArrayInt(100, 10, 30) devolvería un array de 100 números
   * generados al azar comprendidos entre 10 y 30.
   * 
   * @param n      número de elementos que contendrá el array
   * @param minimo límite inferior del intervalo de números aleatorios.
   */
  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int[] x = new int[n];

    for(int i = 0; i < n; i++) {
      x[i] = (int)(Math.random()*(maximo - minimo) + minimo + 1);
    }
      
    return x;
  }

  /**
   * Devuelve el mínimo (el número más pequeño) del array que se pasa como
   * parámetro.
   * 
   * @param x array unidimiensional de números enteros
   * @return  el número más pequeño encontrado en el array que se pasa como
   *          parametro
   */
  public static int minimoArrayInt(int[] x) {
    int minimo = Integer.MAX_VALUE;
    
    for(int i = 0; i < x.length; i++) {
      if (x[i] < minimo) {
        minimo = x[i];
      }
    }
    return minimo;
  }

  /**
   * Devuelve el máximo (el número más grande) del array que se pasa como
   * parámetro.
   * 
   * @param x array unidimiensional de números enteros
   * @return  el número más grande encontrado en el array que se pasa como
   *          parametro
   */
  public static int maximoArrayInt(int[] x) {
    int maximo = Integer.MIN_VALUE;
    
    for(int i = 0; i < x.length; i++) {
      if (x[i] > maximo) {
        maximo = x[i];
      }
    }
      
    return maximo;
  }
    
  
  /**
   * Devuelve la media aritmética de los números contenidos en el array que se
   * pasa como parámetro.
   * 
   * @param x array unidimiensional de números enteros
   * @return  media aritmética de los números contenidos en el array que se pasa
   *          como parámetro
   */
  public static double mediaArrayInt(int[] x) {
    int suma = 0;
    
    for(int i = 0; i < x.length; i++) {
      suma += x[i];
    }
      
    return (double)suma / x.length;
  }
  
  public static boolean estaEnArrayInt(int[] x, int n) {
    
    for(int i = 0; i < x.length; i++)
      if (x[i] == n)
        return true;
      
    return false;
  }
          
  
  
  public static int posicionEnArrayInt(int[] x, int n) {
    
    for(int i = 0; i < x.length; i++)
      if (x[i] == n)
        return i;
      
    return -1;
  }
  
  
  
  public static int[] volteaArrayInt(int[] x) {
    
    int[] a = new int[x.length];
    
    for(int i = 0; i < x.length; i++)
      a[x.length - i - 1] = x[i];
      
    return a;
  }
  
  
  public static int[] rotaDerechaArrayInt(int[] x, int n) {
    
    int[] a = x.clone();
    int i, aux;
    
    while (n-- > 0) {
      aux = a[a.length - 1];
      for(i = a.length - 1; i > 0; i--)
        a[i] = a[i - 1];
      a[0] = aux;
    }
      
    return a;
  }
  
  
  
  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    
    int[] a = x.clone();
    int i, aux;
    
    while (n-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++)
        a[i] = a[i + 1];
      a[a.length - 1] = aux;
    }
      
    return a;
  }
}
