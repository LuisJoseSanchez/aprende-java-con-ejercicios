package s08ejercicio41;

import java.util.Scanner;

public class S04Ejercicio27 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor = s.nextLine();
    
    double precioSabor = 0;
    String tipoChocolate = "";
    
    switch (sabor) {
      case "manzana":
        precioSabor = 18;
      case "fresa":
        precioSabor = 16;
      case "chocolate":
        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
        tipoChocolate = s.nextLine();
        if (tipoChocolate.equals("negro")) {
          precioSabor = 14;
        } else if (tipoChocolate.equals("blanco")) {
          precioSabor = 15;
        }
      default:
    }
    
    System.out.print("¿Quiere nata? (si o no): ");
    boolean conNata = (s.nextLine()).equals("si");

    System.out.print("Tarta de " + sabor);
    
    if (sabor.equals("chocolate")) {
      System.out.print(tipoChocolate);
    }
   
    System.out.println(": " + precioSabor);

  }
}
