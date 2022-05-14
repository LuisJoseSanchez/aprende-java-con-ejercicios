import array.Array;

public class S08Ejercicio48 {

  public static void main(String[] args) {

    final int[] a = {8, 9, 0};
    final int[] b = {1, 2, 3};
    
    System.out.print("a: ");
    Array.muestraArrayInt(a);
    System.out.print("b: ");
    Array.muestraArrayInt(b);
    System.out.print("concatena(a, b): ");
    Array.muestraArrayInt(concatena(a, b));
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
