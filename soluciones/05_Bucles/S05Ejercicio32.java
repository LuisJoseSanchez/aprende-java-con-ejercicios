/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 32
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio32 {

  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // Le da la vueta al número y calcula la longitud
    long numero = numeroIntroducido;
    long volteado = 0;
    int longitud = 0;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while

    // Muestra los dígitos pares
    System.out.print("Dígitos pares: ");

    int digito;
    int sumaPares = 0;
    
    for (int i = 0; i < longitud; i++) {

      digito = (int)(volteado % 10);

      if ((digito % 2) == 0) {
        System.out.print(digito + " ");
        sumaPares += digito;
      }

      volteado /= 10;
    }
    
    // Muestra la suma de los dígitos pares
    System.out.println("\nSuma de los dígitos pares: " + sumaPares);
  }
}

