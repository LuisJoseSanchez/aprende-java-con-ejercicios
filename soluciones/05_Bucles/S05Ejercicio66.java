import java.util.Scanner;

public class S05Ejercicio66 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca la altura de la figura: ");
    int altura = Integer.parseInt(s.nextLine());
    
    if ((altura < 3) || (altura % 2 == 0)) {
      System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
    } else {
      System.out.println();
      for (int i = 0; i < altura / 2; i++) {
        for (int j = 0; j < i; j++) {
          System.out.print(" ");
        }
        System.out.println("*    *");
      }
      
      for (int i = altura / 2; i >= 0; i--) {
        for (int j = 0; j < i; j++) {
          System.out.print(" ");
        }
        System.out.println("*    *");
      }
    }
  }
  
}
