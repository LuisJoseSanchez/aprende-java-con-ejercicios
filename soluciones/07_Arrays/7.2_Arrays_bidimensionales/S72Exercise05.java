/**
 * 
 * 7.2 Arrays bidimensionales
 * 
 * 5. Realiza un programa que rellene un array de 6 filas por 10 columnas
 *    con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 *    A continuación, el programa deberá dar la posición tanto del máximo como del
 *    mínimo.
 * 
 * @author Luis José Sánchez
 * 
 */

public class S72Exercise05 {

	public static void main(String[] args) 
		throws InterruptedException {
 
		int fila, columna, filaMaximo = 0, columnaMaximo = 0, filaMinimo = 0, columnaMinimo = 0;
		int	maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
		int[][] num = new int[6][10];
		
		// Introduce valores aleatorios en el array
		for(fila = 0; fila < 6; fila++) {
			for(columna = 0; columna < 10; columna++) {
				num[fila][columna] = (int)(Math.random() * 1001);
				System.out.printf("%7d   ", num[fila][columna]);
				Thread.sleep(100);
				
				if (num[fila][columna] < minimo) {
					minimo = num[fila][columna];
					filaMinimo = fila;
					columnaMinimo = columna;
				}
				
				if (num[fila][columna] > maximo) {
					maximo = num[fila][columna];
					filaMaximo = fila;
					columnaMaximo = columna;
				}
			}
			System.out.println();
		}

		System.out.println("El máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
		System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
    }
}
