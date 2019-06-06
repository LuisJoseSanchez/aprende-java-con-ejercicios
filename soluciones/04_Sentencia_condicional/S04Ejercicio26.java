import java.util.Scanner;

public class S04Ejercicio26 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Venta de entradas CineCampa");

    System.out.print("Número de entradas: ");
    int entradas = Integer.parseInt(s.nextLine());

    System.out.print("Día de la semana: ");
    String dia = s.nextLine();

    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    boolean tieneTarjeta = (s.nextLine()).equals("s");

    int entradasIndividuales = entradas;
    double precioEntradaIndividual = 8;
    int entradasDePareja = 0;
    double total = 0;
    double descuento = 0;
    double aPagar = 0;

    switch (dia) {
      case "miércoles":
      case "miercoles":
        precioEntradaIndividual = 5;
      case "jueves":
        entradasDePareja = entradas / 2;
        entradasIndividuales = entradas % 2;
      default:
    }

    total = precioEntradaIndividual * entradasIndividuales;
    total += 11 * entradasDePareja;
    
    if(tieneTarjeta) {
      descuento = total * 0.1;
    }

    aPagar = total - descuento;

    System.out.println("\nAquí tiene sus entradas. Gracias por su compra.");

    if (entradasDePareja > 0) {
      System.out.printf("Entradas de pareja            %2d\n", entradasDePareja);
      System.out.printf("Precio por entrada de pareja  %5.2f €\n", 11.0);
    }

    if (entradasIndividuales > 0) {
      System.out.printf("Entradas individuales         %2d\n", entradasIndividuales);
      System.out.printf("Precio por entrada individual %5.2f €\n", precioEntradaIndividual);
    }

    System.out.printf("Total                         %5.2f €\n", total);
    System.out.printf("Descuento                     %5.2f €\n", descuento);
    System.out.printf("A pagar                       %5.2f €\n", aPagar);
  }
}
