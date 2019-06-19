import java.util.Scanner;

public class S05Ejercicio58 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    int suma = 0;
    int longitud = 0;
    
    while (numeroIntroducido > 0) {
      suma += numeroIntroducido % 10;
      numeroIntroducido /= 10;
      longitud++;
    }

    System.out.println("La media de sus dígitos es " + (double)suma / longitud);
  }
  
}
