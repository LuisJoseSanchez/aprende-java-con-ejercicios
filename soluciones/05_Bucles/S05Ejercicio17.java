/**
 * 5. Bucles
 * 
 * 17. Realiza un programa que sume los 100 números  siguientes a un número entero y positivo
 *     introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es
 *     un número positivo).
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio17 {

  public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    
    do {
      System.out.print("Introduzca un número entero positivo: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if(numeroIntroducido < 0) {
        System.out.print("El número introducido no es correcto,");
        System.out.println(" debe introducir un número positivo.");
      }
    } while (numeroIntroducido < 0);
    
    int suma = 0;
    
    for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
      suma += i;
    }

    System.out.print("La suma de los 100 números siguientes a ");
    System.out.println(numeroIntroducido + " es " + suma + ".");
  }
}
