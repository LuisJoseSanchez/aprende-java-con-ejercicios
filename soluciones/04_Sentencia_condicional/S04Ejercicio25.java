import java.util.Scanner;

/**
 * Aprende Java con Ejercicios
 * https://leanpub.com/aprendejava
 * 
 * Capítulo 4. Sentencia condicional.
 * 
 * Ejercicio 25
 *
 * @author Luis José Sánchez
 */
public class S04Ejercicio25 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = Integer.parseInt(s.nextLine());
    System.out.print("Ahora introduzca la anchura: ");
    int anchura = Integer.parseInt(s.nextLine());
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    boolean conEscudo = ((s.nextLine()).toLowerCase()).equals("s");

    String escudoCadena;
    float precioEscudo;
    
    if (conEscudo) {
      escudoCadena = "Con escudo";
      precioEscudo = 2.50f;
    } else {
      escudoCadena = "Sin escudo";
      precioEscudo = 0;
    }

    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.printf("Bandera de %5d cm2: %5.2f €\n", anchura * altura, (float)anchura * altura / 100);
    System.out.printf("%s:           %5.2f €\n", escudoCadena, precioEscudo);
    System.out.printf("Gastos de envío:      %5.2f €\n", 3.25);
    System.out.printf("Total:                %5.2f €\n", (float)anchura * altura / 100 + precioEscudo + 3.25);
  }
}
