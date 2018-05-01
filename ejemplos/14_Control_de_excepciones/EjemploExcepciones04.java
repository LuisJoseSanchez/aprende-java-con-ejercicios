package ejemploexcepciones01;

import java.util.Scanner;

public class EjemploExcepciones04 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Este programa pinta una línea de asteriscos");
    
    System.out.print("Introduzca la longitud de la línea (un número entero): ");
    int longitud = Integer.parseInt(s.nextLine());
    
    for (int i = 0; i < longitud; i++) {
      System.out.print("*");
    }
  }
}
