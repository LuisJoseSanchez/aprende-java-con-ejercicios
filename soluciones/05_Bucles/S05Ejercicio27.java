/**
 * 5. Bucles
 * 
 * 27. Escribe un programa que muestre, cuente y sume los  múltiplos de 3 que hay entre 1 y un
 *     número leído por teclado.
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio27 {

  public static void main(String[] args) {
      
    System.out.print("Introduzca un número entero mayor que 1: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int cuenta = 0;
    int suma = 0;
    
    for (int i = 1; i < numeroIntroducido; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
        
    System.out.print("\nDesde 1 hasta " + numeroIntroducido + " hay " + cuenta);
    System.out.println(" múltiplos de 3 y suman " + suma + ".");
  }
}
