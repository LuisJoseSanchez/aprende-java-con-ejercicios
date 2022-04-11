/**
 * 5. Bucles
 * 
 * 9. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio09 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    long n = numeroIntroducido;
    int numeroDeDigitos = 1;
    
    while (n > 10) {
      numeroDeDigitos++;
      n /= 10;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
  }
}
