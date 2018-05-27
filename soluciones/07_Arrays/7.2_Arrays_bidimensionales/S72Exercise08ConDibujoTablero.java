/**
 * 
 * 7.2 Arrays bidimensionales
 *
 * 8. Escribe un programa que, dada una posición en un tablero de ajedrez,
 *    nos diga a qué casillas podría saltar un alfil que se encuentra en esa
 *    posición. Como se indica en la figura, el alfil se mueve siempre en
 *    diagonal. El tablero cuenta con 64 casillas.
 *    Las columnas se indican con las letras de la "a" a la "h" y las filas
 *    se indican del 1 al 8.
 *    Ejemplo:
 *    Introduzca la posición del alfil: d5
 *    El alfil puede moverse a las siguientes posiciones: h1 a2 g2 b3 e3 c4 e4 c6 e6 b7 f7 a8 g8
 * 
 * @author Luis José Sánchez
 * 
 */
public class S72Exercise08ConDibujoTablero {

  public static void main(String[] args) {

    // se definen constantes para representar el
    // contenido de las celdas
    final String RESET = "\033[0m";
    final String INVERSO = "\033[7m";
    final String BLANCA = "  ";
    final String NEGRA = INVERSO + BLANCA + RESET;
    final String ALFIL = "♝ ";  // ∆♝۩♗
    final String MOVIMIENTOBLANCO = "• "; // ●
    final String MOVIMIENTONEGRO = INVERSO + MOVIMIENTOBLANCO + RESET;
  
    String[][] tablero = new String[9][9]; // la fila 0 y la columna 0 no se utilizan
    int fila;
    int columna;
    String casilla;

    // pinta el tablero vacío
    System.out.println("\n  ░░░░░░░░░░░░░░░░░░░░");
    casilla = BLANCA;
    for(fila = 8; fila >= 1; fila--) {
      System.out.print( fila + " ░░");
      for(columna = 1; columna <= 8; columna++) {
        if ((fila % 2) == 1) { // fila impar
          if ((columna % 2) == 1) { // columna impar
            casilla = BLANCA;
          } else { // columna par
            casilla = NEGRA;
          }
        } else { // fila par
          if ((columna % 2) == 1) { // columna impar
            casilla = NEGRA;
          } else { // columna par
            casilla = BLANCA;
          }
        }
        System.out.print(casilla);
        tablero[fila][columna] = casilla;
      }
      System.out.println("░░");
    }
    System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
    System.out.println("     a b c d e f g h");
        
    // pide las coordenadas
    System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
    String posicionAlfil = System.console().readLine();
    int columnaAlfil = (int)(posicionAlfil.charAt(0)) - 96;
    int filaAlfil = (int)(posicionAlfil.charAt(1)) - 48;
    
    if ((((filaAlfil % 2) + (columnaAlfil % 2)) % 2) == 0) {
      tablero[filaAlfil][columnaAlfil] = ALFIL;
    } else {
      tablero[filaAlfil][columnaAlfil] = INVERSO + ALFIL + RESET;
    }
    
    // pinta el tablero con el alfil y las posiciones hacia donde puede moverse
    System.out.println("\n  ░░░░░░░░░░░░░░░░░░░░");
    for(fila = 8; fila >= 1; fila--) {
      System.out.print( fila + " ░░");
      for(columna = 1; columna <= 8; columna++) {
        if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
              && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
          if (tablero[fila][columna] == BLANCA) {
            tablero[fila][columna] = MOVIMIENTOBLANCO;
          } else {
            tablero[fila][columna] = MOVIMIENTONEGRO;
          }
        }
        System.out.print(tablero[fila][columna]);
      }
      System.out.println("░░");
    }
    System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
    System.out.println("     a b c d e f g h");
    
    System.out.println("\nEl alfil puede moverse a las siguientes posiciones:");
    
    for(fila = 8; fila >= 1; fila--) {
      for(columna = 1; columna <= 8; columna++) {
        if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
              && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
          System.out.print((char)(columna + 96) + "" + fila + " ");
        }
      }
    }
  }
}
