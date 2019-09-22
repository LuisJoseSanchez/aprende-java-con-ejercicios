import java.util.Scanner;

public class EjemploExcepciones05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa pinta varias líneas de asteriscos");

    try {
      
      System.out.print("Introduzca el número total de asteriscos: ");
      int asteriscos = Integer.parseInt(s.nextLine());

      System.out.print("Introduzca el número de líneas que quiere pintar: ");
      int lineas = Integer.parseInt(s.nextLine());

      int longitud = (asteriscos % lineas) == 0 ? asteriscos / lineas : (int) Math.ceil((double) asteriscos / lineas);

      int cuentaAsteriscos = 0;

      for (int i = 1; i <= lineas; i++) {
        System.out.print("Línea " + i + ": ");
        for (int j = 0; (j < longitud) && (cuentaAsteriscos++ < asteriscos); j++) {
          System.out.print("*");
        }
        System.out.println();
      }
      
    } catch (NumberFormatException nfe) {
      
      System.out.println("Los datos introducidos no son correctos.");
      System.out.println("Se deben introducir números enteros.");
      
    } catch (ArithmeticException ae) {
      
      System.out.println("El número de líneas no puede ser 0.");

    }

  }
}
