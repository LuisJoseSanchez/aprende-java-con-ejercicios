import java.util.Scanner;

public class EjemploExcepciones02V2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa calcula la media de dos números");

    try {

      System.out.print("Introduzca el primer número: ");
      double numero1 = Double.parseDouble(s.nextLine());

      System.out.print("Introduzca el segundo número: ");
      double numero2 = Double.parseDouble(s.nextLine());

      System.out.println("La media es " + (numero1 + numero2) / 2);

    } catch (Exception e) {

      System.out.println("Excepción: " + e.getClass());
      System.out.println("Error: " + e.getMessage());
      System.out.println("No se puede calcular la media. ");
      System.out.println("Los datos introducidos no son correctos.");

    }

  }
}
