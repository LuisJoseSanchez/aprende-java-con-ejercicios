import java.util.Scanner;

public class S71Ejercicio22 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca el tamaño del array: ");
    int n = Integer.parseInt(s.nextLine());

    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = (int) (Math.random() * 201);
    }

    System.out.println("\nArray original:");
    
    System.out.print("Índice ");
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%5d", i);
    }
    
    System.out.print("\nValor  ");
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%5d", a[i]);
    }
    
    int[] r = new int[n];
    int izquierda = 0;
    int derecha = n - 1;
    
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        r[izquierda++] = a[i];
      } else {
        r[derecha--] = a[i];
      }
    }

    System.out.println("\n\nArray resultado:");
    
    System.out.print("Índice ");
    for (int i = 0; i < r.length; i++) {
      System.out.printf("%5d", i);
    }
    
    System.out.print("\nValor  ");
    for (int i = 0; i < r.length; i++) {
      System.out.printf("%5d", r[i]);
    }
  }

}
