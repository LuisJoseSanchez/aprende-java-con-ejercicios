import java.util.Scanner;

public class S08Ejercicio49 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("¿Cuántos términos de la sucesión look and say quiere calcular? ");
    int n = Integer.parseInt(s.nextLine());

    int[] a = {1};

    for (int i = 1; i <= n; i++) {
      System.out.print(convierteArrayEnString(a));
      if (i < n) {
        System.out.print(", ");
      } else {
        System.out.println();
      }

      int[] resultado = {};

      while (a.length > 0) {
        int[] aux = new int[2];
        aux[0] = repeticionesDelPrimero(a);
        aux[1] = a[0];
        a = cola(a);
        resultado = concatena(resultado, aux);
      }

      a = resultado.clone();
    }
  }

  public static String convierteArrayEnString(int[] a) {
    String resultado = "";
    for (int digito : a) {
      resultado += digito;
    }
    return resultado;
  }

  public static int repeticionesDelPrimero(int[] a) {

    int repeticiones = 0;
    int i = 0;

    while ((i < a.length) && (a[0] == a[i])) {
      repeticiones++;
      i++;
    }

    return repeticiones;
  }

  public static int[] cola(int[] a) {
    // Si el array está vacío, se devuelve un array vacío
    if (a.length == 0) {
      int[] aux = {};
      return aux;
    }

    int r = repeticionesDelPrimero(a);
    int[] c = new int[a.length - r];
    for (int i = r; i < a.length; i++) {
      c[i - r] = a[i];
    }

    return c;
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
