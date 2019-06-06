import java.util.Scanner;

public class S05Ejercicio53 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
}
