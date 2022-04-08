/**
 * 4. Sentencia Condicional
 *
 * 19. Realiza un programa que nos diga cuántos dígitos tiene un número
 *     entero que puede ser positivo o negativo. Se permiten números de
 *     hasta 5 dígitos.
 *
 * @author Luis José Sánchez
 */
public class S04Ejercicio19 {

  public static void main(String[] args) {
    
    int n, digitos = 0;
    
    System.out.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
    n = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if ( n < 10 ) {
      digitos = 1;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      digitos = 2;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      digitos = 3;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      digitos = 4;
    }
    
    if ( n >= 10000 ) {
      digitos = 5;
    }
    
    if (digitos == 1) {
      System.out.println("El número introducido tiene 1 dígito.");
    } else {
      System.out.println("El número introducido tiene " + digitos + " dígitos.");
    }
  }
}
