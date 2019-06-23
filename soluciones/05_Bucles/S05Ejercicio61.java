import java.util.Scanner;

public class S05Ejercicio61 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la V (un número mayor o igual a 3): ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    int altura = 0;
    int i = 0;
    int espaciosInternos = alturaIntroducida * 2 - 1;
    int espaciosPorDelante = 0;

    if (alturaIntroducida < 3) {
      System.out.println("La altura debe ser mayor o igual a 3.");
    } else {
      while (altura < alturaIntroducida) {    
        // inserta espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea
        System.out.print("***");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        System.out.println("***");

        altura++;
        espaciosPorDelante++;
        espaciosInternos -= 2;      
      } // while
    } // else
  }
  
}
