import java.util.Scanner;

public class EjemploExcepciones04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa pinta varias líneas de asteriscos");

    System.out.print("Introduzca el número total de asteriscos: ");
    int asteriscos = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el número de líneas que quiere pintar: ");
    int lineas = Integer.parseInt(s.nextLine());

    int longitud = (asteriscos % lineas) == 0 ? asteriscos / lineas : (int)Math.ceil((double)asteriscos / lineas);
    
    int cuentaAsteriscos = 0;

    for (int i = 1; i <= lineas; i++) {
      System.out.print("Línea " + i + ": ");
      for (int j = 0; (j < longitud) && (cuentaAsteriscos++ < asteriscos); j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
