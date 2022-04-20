/**
 * Quiniela aleatoria con tres columnas rellenas y pleno al quince.
 *
 * @author Luis José Sánchez
 */
public class S06Ejercicio07 {
  public static void main(String[] args) {
    
    int resultadoPartido;
    int columnas = 3;
    
    for (int fila = 1; fila <= 14; fila++) {
      System.out.printf("%2d. |", fila);

      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultadoPartido = (int)(Math.random() * 3) + 1;
        switch(resultadoPartido) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
          default:
        }
      }
      System.out.println();
    }
    
    // Pleno al 15
    
    System.out.print("\nPLENO AL 15 - Local...");
    int goles = (int)(Math.random() * 4);
    System.out.print(goles < 3 ? goles : "M");
    
    System.out.print("   Visitante...");
    goles = (int)(Math.random() * 4);
    System.out.print(goles < 3 ? goles : "M");
  }
}
