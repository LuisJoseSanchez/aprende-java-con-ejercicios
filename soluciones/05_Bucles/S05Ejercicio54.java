import java.util.Scanner;

public class S05Ejercicio54 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());

    // Primera línea
    for (int i = 0; i < altura; i++) {
      System.out.print("*");
    }
    System.out.println();

    // Parte intermedia
    for (int i = 1; i < altura - 1; i++) {
      System.out.print("*");
      for (int j = 0; j < altura - i - 2; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    
    // Vértice inferior
    System.out.println("*");
  }

}
