/**
 * 5. Bucles
 * 
 * 25. Realiza un programa que pida un número por teclado y que luego
 *     muestre ese número al revés.
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio25 {

  public static void main(String[] args) {

    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numero = numeroIntroducido;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    System.out.print("Si le damos la vuelta al " + numeroIntroducido);
    System.out.println(" tenemos el " + volteado + ".");
  }
}
