import array.Array;

public class S08Ejercicio52 {

  public static void main(String[] args) {
    final int[] a = {111, 222, 333, 444};
    final int[] b = {52, 37};
    Array.muestraArrayInt(a);
    System.out.println(aleatorioDeArray(a));
    Array.muestraArrayInt(b);
    System.out.println(aleatorioDeArray(b));
  }

  public static int aleatorioDeArray(int[] a) {
    return a[(int)(Math.random() * a.length)];
  }

}
