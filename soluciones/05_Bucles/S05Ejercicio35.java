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

        int altura;

        do {
            System.out.print("Por favor, introduzca la altura de la X: ");
            altura = Integer.parseInt(System.console().readLine());

            if (altura % 2 == 0 || altura < 3) {

                System.out.println("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3.");
            }

        } while (altura % 2 == 0 || altura < 3);

        System.out.println();

        // Este bucle pinta las filas indicadas en la altura
        for (int i = 1; i <= altura; i++) {

            // Este bucle pinta las columnas de cada fila
            for (int j = 1; j <= altura; j++) {

                // Con un bloque IF indicamos cuando queremos un "_" o un "*"
                if (j == i || j == altura + 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
