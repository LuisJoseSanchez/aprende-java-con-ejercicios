/**
 * Coloreado de texto
 *
 * Muestra varias palabras en el color que corresponde.
 *
 * @author Luis José Sánchez
 */

public class Colores {
  public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";

    System.out.print(naranja + "mandarina" + verde + " hierba");
    System.out.print(naranja + " saltamontes" + rojo + " tomate");
    System.out.print(blanco + " sábanas" + azul + " cielo");
    System.out.print(morado + " nazareno" + azul + " mar");
  }
}
