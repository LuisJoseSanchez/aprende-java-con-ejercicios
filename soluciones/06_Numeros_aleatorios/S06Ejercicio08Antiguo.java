/**
 * Quiniela aleatoria con tres columnas rellenas dando más peso
 * al 1, luego a la x y luego al 2.
 * Pleno al quince antiguo, cuando era como un partido más (1, X, 2)
 * 
 * @author Luis José Sánchez
 */
public class S06Ejercicio08Antiguo {
  public static void main(String[] args) {

    int resultadoPartido;
    int columnas = 3;
    
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf("%4d. |", fila);

      if (fila == 15) {
        columnas = 1;
      }
      
      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultadoPartido = (int)(Math.random() * 6) + 1;
        switch(resultadoPartido) {
          case 1:
          case 2:
          case 3:
            System.out.print("1  |");
            break;
          case 4:
          case 5:
            System.out.print(" X |");
            break;
          case 6:
            System.out.print("  2|");
          default:
        }
      }
      System.out.println();
    }
  }
}
