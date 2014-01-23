/**
 * 
 * 7.2 Arrays bidimensionales
 * 
 * 6. Modica el programa anterior de tal forma que no se repita ningún número en el array.
 * 
 * @author Luis José Sánchez
 * 
 */

public class S72Exercise06 {

	public static void main(String[] args) 
		throws InterruptedException {
 
		int fila, columna, i, j, filaMaximo = 0, columnaMaximo = 0, filaMinimo = 0, columnaMinimo = 0;
		int	maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
		int repeticiones = 666;
		int[][] num = new int[6][10];
		boolean arrayValida = true;
		
		// Introduce valores aleatorios en el array de tal forma que no se repita ninguno
		do {
			arrayValida = true;
			
			for(fila = 0; fila < 6; fila++)
				for(columna = 0; columna < 10; columna++)
					num[fila][columna] = (int)(Math.random() * 1001);

			for(fila = 0; fila < 6; fila++)
				for(columna = 0; columna < 10; columna++) {
					repeticiones = 0;
					
					for(i = 0; i < 6; i++)
						for(j = 0; j < 10; j++)
							if (num[fila][columna] == num[i][j])
								repeticiones++;
								
					if (repeticiones > 1)
						arrayValida = false;
				}
				

						
		} while (!arrayValida);
		// Calcula el máximo, el mínimo y las posiciones que ocupan
		for(fila = 0; fila < 6; fila++) {
			for(columna = 0; columna < 10; columna++) {
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
