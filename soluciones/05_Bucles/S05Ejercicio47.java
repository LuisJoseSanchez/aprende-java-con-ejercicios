import java.util.Scanner;

/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 47
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio47 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
    int altura = Integer.parseInt(s.nextLine());

    int alturaAux = (altura - 3) / 2;
    
    if ((altura % 2 != 0) && (altura >= 5)) {
      System.out.println("MMMMMM");
      
      for (int i = 0; i < alturaAux; i++) {
        System.out.println("M    M");
      }
      
      System.out.println("MMMMMM");
      
      for (int i = 0; i < alturaAux; i++) {
        System.out.println("M    M");
      }
      
      System.out.println("MMMMMM");
    } else {
      System.out.println("La altura introducida no es correcta.");
    }
  }
}
