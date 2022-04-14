/**
 * 5. Bucles
 * 
 * 26. Realiza un programa que pida primero un número y a continuación un dígito. El programa nos
 *     debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en
 *     el número introducido.
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio26 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero: ");
    long numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(System.console().readLine());

    System.out.print("Contando de izquierda a derecha, el " + digito);
    System.out.println(" aparece dentro de " + numeroIntroducido);
    System.out.print("en las siguientes posiciones: ");
    
    // se hace una copia del número introducido
    long numero = numeroIntroducido;
    
    // añade un 1 al final por si el número introducido termina en ceros,
    // por ej. 10, 1000, etc.
    numero = numero * 10 + 1;
    
    // le da la vueta al número y calcula la longitud
    
    long volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while
        
    // comprueba la posición
    while (volteado != 1) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;
      posicion++;
    } // while

    System.out.println();
  }
}

