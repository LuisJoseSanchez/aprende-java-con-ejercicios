/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 6. Números aleatorios.
 * 
 * Ejercicio 22
 * 
 * @author Luis José Sánchez
 */
public class S06Ejercicio22 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la longitud de la serpiente ");
    System.out.print("contando la cabeza: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    // pinta la cabeza
    System.out.println("\n            @");
    
    // pinta el cuerpo
    int i;
    int x = 13;
        
    while (longitud > 1) {
      // suma -1, 0 o 1 a la variable x
      x += (int)(Math.random() * 3) - 1;
      
      // pinta x - 1 espacios
      for (i = 1; i < x; i++) {
        System.out.print(" ");
      }

      // pinta el cuerpo
      System.out.println("#");

      longitud--;
    }
  }
}
