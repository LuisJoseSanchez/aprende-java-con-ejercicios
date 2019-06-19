import java.util.Scanner;

public class S04Ejercicio27 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor = s.nextLine();

    double precioSabor = 0;
    double precioNata = 0;
    double precioNombre = 0;
    String tipoChocolate = "";

    switch (sabor) {
      case "manzana":
        precioSabor = 18;
        break;
      case "fresa":
        precioSabor = 16;
        break;
      case "chocolate":
        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
        tipoChocolate = s.nextLine();
        if (tipoChocolate.equals("negro")) {
          precioSabor = 14;
        } else if (tipoChocolate.equals("blanco")) {
          precioSabor = 15;
        }
        break;
      default:
    }

    System.out.print("¿Quiere nata? (si o no): ");
    boolean conNata = s.nextLine().equals("si");
    
    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    boolean conNombre = s.nextLine().equals("si");

    System.out.print("Tarta de " + sabor);

    if (sabor.equals("chocolate")) {
      System.out.print(" " + tipoChocolate);
    }

    System.out.printf(": %.2f €\n", precioSabor);
    
    if (conNata) {
      precioNata = 2.5;
      System.out.printf("Con nata: %.2f €\n", precioNata);
    }
    
    if (conNombre) {
      precioNombre = 2.75;
      System.out.printf("Con nombre: %.2f €\n", precioNombre);
    }
    
    System.out.printf("Total: %.2f €\n", precioSabor + precioNata + precioNombre);
  }

}
