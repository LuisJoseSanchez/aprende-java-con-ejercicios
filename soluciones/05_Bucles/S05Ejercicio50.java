import java.util.Scanner;

/**
 * Aprende Java con Ejercicios
 * https://leanpub.com/aprendejava
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 50
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio50 {
  
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura (5 como mínimo): ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
    int espacios = Integer.parseInt(s.nextLine());

    // Parte superior del 5 //////////////////////////
    // Fila 1
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");

    // Fila 2
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("*   ");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("*");

    // Fila 3 (igual que la fila 1)
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");

    // Parte inferior del 5 //////////////////////////
    // Filas variables
    for (int fila = 0; fila < altura - 4; fila++) {
      System.out.print("*");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.print("   *");
      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.println("   *");
    }

    // Última fila (igual que la primera)
    System.out.print("*");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.print("****");
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
    System.out.println("****");
  }
}
