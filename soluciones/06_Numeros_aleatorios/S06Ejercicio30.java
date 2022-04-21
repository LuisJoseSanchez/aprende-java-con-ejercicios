import java.util.Scanner;

public class S06Ejercicio30 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alto = Integer.parseInt(s.nextLine());

    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int ancho = Integer.parseInt(s.nextLine());

    int posicion = 0;
    int posicionPez;
    int posicionCaballito;
    int posicionCaracola;

    do {
      posicionPez = (int) (Math.random() * (alto - 2) * (ancho - 2));
      posicionCaballito = (int) (Math.random() * (alto - 2) * (ancho - 2));
      posicionCaracola = (int) (Math.random() * (alto - 2) * (ancho - 2));
    } while (
      (posicionPez == posicionCaballito) ||
      (posicionPez == posicionCaracola) ||
      (posicionCaballito == posicionCaracola));

    System.out.println();

    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();

    for (int i = 2; i < alto; i++) {
      System.out.print("*");
      for (int j = 2; j < ancho; j++) {
        if (posicion == posicionPez) {
          System.out.print("&");
        } else if (posicion == posicionCaracola) {
          System.out.print("@");
        } else if (posicion == posicionCaballito) {
          System.out.print("$");
        } else {
          System.out.print(" ");
        }
        posicion++;
      }
      System.out.println("*");
    }

    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();
  }

}
