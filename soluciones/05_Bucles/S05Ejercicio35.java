/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 5. Bucles.
 * 
 * Ejercicio 35
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio35 {

  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la altura de la X: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int i = 0;
    int espaciosInternos = alturaIntroducida - 1;
    int espaciosPorDelante = 0;

    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3.");
    } else {
      // parte de arriba /////////////////////////////////////
      while (altura < alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        
        System.out.println();
        altura++;
        espaciosPorDelante++;
        espaciosInternos -= 2;      
      } // while parte de arriba ///////////////////////
      
      // parte de abajo /////////////////////////////////////
      espaciosInternos = 0;
      espaciosPorDelante = alturaIntroducida / 2;
      altura = 1;
      while (altura <= alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea
        System.out.print("*");
        for (i = 1; i < espaciosInternos; i++) {
          System.out.print(" ");
        }
        
        if(altura>1) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante--;
        espaciosInternos+=2;
      } // while parte de abajo ///////////////////////
    } // else
  }
}
