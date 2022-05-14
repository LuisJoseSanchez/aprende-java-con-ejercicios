public class S08Ejercicio47 {

  public static void main(String[] args) {

    final int[] a = {};
    System.out.println("a: " + convierteArrayEnString(a));

    final int[] b = {8};
    System.out.println("b: " + convierteArrayEnString(b));
    
    final int[] c = {6, 2, 5, 0, 1};
    System.out.println("b: " + convierteArrayEnString(c));

  }

  public static String convierteArrayEnString(int[] a) {
    String resultado = "";
    for (int digito : a) {
      resultado += digito;
    }
    return resultado;
  }

}
