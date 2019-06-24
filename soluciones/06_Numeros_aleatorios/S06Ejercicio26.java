import java.util.Scanner;

public class S06Ejercicio26 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la anchura de la tableta: ");
    int anchura = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca la altura de la tableta: ");
    int altura = Integer.parseInt(s.nextLine());
    
    int posicionMordisco = (int) (Math.random() * (anchura * 2 + (altura - 2) * 2));
    
    int posicion = 0;
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < anchura; j++) {
        boolean estaEnBorde = (i == 0) || (i == altura - 1) || (j == 0) || (j == anchura - 1);
        
        if ((posicion == posicionMordisco) && estaEnBorde) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
        
        if (estaEnBorde) {
          posicion++;
        }
      }
      System.out.println();
    }
  }

}
