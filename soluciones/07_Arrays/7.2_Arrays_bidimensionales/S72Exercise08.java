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

	// se definen constantes para representar el
	// contenido de las celdas
	static final String NEGRA = "██"; // █ ■
	static final String BLANCA = "  ";
	static final String ALFIL = "♗ ";  // ∆♝۩
	static final String MOVIMIENTOBLANCO = "• "; // ●
	static final String MOVIMIENTONEGRO = "◙ "; // ◘◙
	
	public static void main(String[] args) {
 
		String nombreFila = "hgfedcba";
		String[][] tablero = new String[8][8];
		int fila, columna;
		String casilla;

		// pinta el tablero vacío
		System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
		casilla = BLANCA;
		for(fila = 0; fila < 8; fila++) {
			System.out.print(nombreFila.charAt(fila)+ " ░░");
			for(columna = 0; columna < 8; columna++) {
				System.out.print(casilla);
				tablero[fila][columna] = casilla;
				if (casilla.equals(BLANCA))
					casilla = NEGRA;
				else
					casilla = BLANCA;
			}
			if (casilla.equals(BLANCA))
				casilla = NEGRA;
			else
				casilla = BLANCA;
			System.out.println("░░");
		}
		System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
		System.out.println("     1 2 3 4 5 6 7 8");
				
		// pide las coordenadas	
		System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
		String posicionAlfil = System.console().readLine();
		int filaAlfil = nombreFila.indexOf(posicionAlfil.charAt(0));
		int columnaAlfil = posicionAlfil.charAt(1) - 1 - 48;
		tablero[filaAlfil][columnaAlfil] = ALFIL;
		
		// pinta el tablero con el alfil y las posiciones hacia donde
		// puede moverse
		System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
		for(fila = 0; fila < 8; fila++) {
			System.out.print(nombreFila.charAt(fila)+ " ░░");
			for(columna = 0; columna < 8; columna++) {
				if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna)) && (! ((filaAlfil == fila) && (columnaAlfil == columna))))
					if (tablero[fila][columna] == BLANCA)
						tablero[fila][columna] = MOVIMIENTOBLANCO;
					else
						tablero[fila][columna] = MOVIMIENTONEGRO;
					
				System.out.print(tablero[fila][columna]);
			}
			System.out.println("░░");
		}
		System.out.println("  ░░░░░░░░░░░░░░░░░░░░");
		System.out.println("     1 2 3 4 5 6 7 8");
		
    }
}
