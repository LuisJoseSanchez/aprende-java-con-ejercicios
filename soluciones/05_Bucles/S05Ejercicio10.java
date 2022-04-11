/**
 * 5. Bucles
 * 
 * 10. Escribe un programa que calcule la media de un conjunto de números
 *     positivos introducidos por teclado. A priori, el programa no sabe
 *     cuántos números se introducirán. El usuario indicará que ha terminado
 *     de introducir los datos cuando meta un número negativo.
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio10 {
  public static void main(String[] args) {
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Este programa calcula la media de los números positivos introducidos.");
    System.out.println("Para parar, introduzca un número negativo.");
    System.out.println("Vaya introduciendo números:");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Double.parseDouble(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.print("La media de los números positivos introducidos es ");
    System.out.println((suma - numeroIntroducido) / (numeros - 1));
  }
}
