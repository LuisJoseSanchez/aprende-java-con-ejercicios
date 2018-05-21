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
public class S72Exercise08 {

  public static void main(String[] args) {
     
    System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
    String posicionAlfil = System.console().readLine();
    int columnaAlfil = (int)(posicionAlfil.charAt(0)) - 96;
    int filaAlfil = (int)(posicionAlfil.charAt(1)) - 48;
    
    System.out.println("El alfil puede moverse a las siguientes posiciones:");
    
    for(int fila = 8; fila >= 1; fila--) {
      for(int columna = 1; columna <= 8; columna++) {
        if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
              && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
          System.out.print((char)(columna + 96) + "" + fila + " ");
        }
      }
    }
  }
}
