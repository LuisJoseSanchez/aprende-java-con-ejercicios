/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 37
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio37 {

  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // Voltea el número introducido ////////////////////////////////////////////
    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while

    // Pinta el número con palotes /////////////////////////////////////////////
    int palotes;
    
    while (volteado > 0) {
      palotes = (int)(volteado % 10); // último dígito de volteado
      // Pinta el dígito con palotes. Por ej. si es un 3, pinta 3 palotes.
      for (int i = 0; i < palotes; i++) {
        System.out.print("|");
      }
      if (volteado > 10) { // para no pintar el último guión
        System.out.print(" - "); // separador de dígitos
      }
      volteado = volteado / 10; // quita el último dígito a volteado
    } // while    
  }
}


