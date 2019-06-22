public class S08Ejercicio48 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    int[] a = {8, 9, 0};
    int[] b = {1, 2, 3};
    
    for (int e : concatena(a, b)) {
      System.out.println(e);
    }
    
  }

  public static int[] concatena(int[] a, int[] b) {
    int[] resultado = new int[a.length + b.length];

    for (int i = 0; i < a.length; i++) {
      resultado[i] = a[i];
    }

    for (int i = 0; i < b.length; i++) {
      resultado[i + a.length] = b[i];
    }

    return resultado;
  }
  
}
