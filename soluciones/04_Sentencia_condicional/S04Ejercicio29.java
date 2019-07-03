import java.util.Scanner;

public class S04Ejercicio29 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String pitufo = "";
    String resultado = "";
    double precioComida = 0;
    double precioBebida = 0;

    // Comida
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comida = s.nextLine();

    if (comida.equalsIgnoreCase("pitufo")) {
      System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
      pitufo = s.nextLine();

      if (pitufo.equalsIgnoreCase("aceite")) {
        resultado = "Pitufo con aceite: 1,20 €";
        precioComida = 1.20;
      } else if (pitufo.equalsIgnoreCase("tortilla")) {
        resultado = "Pitufo con tortilla: 1,60 €";
        precioComida = 1.60;
      }
    } else if (comida.equalsIgnoreCase("palmera")) {
      resultado = "Palmera: 1,40 €";
      precioComida = 1.40;
    } else if (comida.equalsIgnoreCase("donut")) {
      resultado = "Donut: 1,00 €";
      precioComida = 1.00;
    }

    // Bebida
    System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
    String bebida = s.nextLine();
    if (bebida.equalsIgnoreCase("zumo")) {
      resultado += "\nZumo: 1,50 €";
      precioBebida = 1.50;
    } else if (bebida.equalsIgnoreCase("café")) {
      resultado += "\nCafé: 1,20 €";
      precioBebida = 1.20;
    }

    System.out.println(resultado);
    System.out.printf("Total desayuno: %.2f €\n", precioComida + precioBebida);
  }

}
