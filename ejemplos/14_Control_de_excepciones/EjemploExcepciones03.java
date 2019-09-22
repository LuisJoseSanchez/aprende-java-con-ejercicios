import java.util.Scanner;

public class EjemploExcepciones03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa calcula la media de dos números");

    boolean datoValido = false;
    
    double numero1 = 0;

    do {
      try {
        System.out.print("Introduzca el primer número: ");
        numero1 = Double.parseDouble(s.nextLine());
        datoValido = true;
      } catch (Exception e) {
        System.out.print("El dato introducido no es correcto, debe ser un número.");
        System.out.println(" Por favor, inténtelo de nuevo.");
      }
    } while (!datoValido);

    double numero2 = 0;

    do {
      try {
        datoValido = false;
        System.out.print("Introduzca el segundo número: ");
        numero2 = Double.parseDouble(s.nextLine());
        datoValido = true;
      } catch (Exception e) {
        System.out.print("El dato introducido no es correcto, debe ser un número.");
        System.out.println(" Por favor, inténtelo de nuevo.");
      }
    } while (!datoValido);

    System.out.println("La media es " + (numero1 + numero2) / 2);

  }
}
