/**
 * 5. Bucles
 * 
 * 15. Escribe un programa que dados dos números, uno real (base) y un
 *     entero positivo (exponente), saque por pantalla todas las potencias
 *     con base el numero dado y exponentes entre uno y el exponente introducido.
 *     No se deben utilizar funciones de exponenciación. Por ejemplo, si
 *     introducimos el 2 y el 5, se deberán mostrar 2¹, 2², 2³, 2⁴ y 2⁵.
 * 
 * @author Luis José Sánchez
 */

public class S05Ejercicio15 {

  public static void main(String[] args) {
     
    System.out.print("Introduzca un número real como base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca un múmero entero como exponente: ");
    int exponenteFinal = Integer.parseInt(System.console().readLine());

    double potencia;
    int exponente;
        
    for (int i = 1; i <= exponenteFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }

  }
}
