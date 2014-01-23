/**
 * 
 * 7.2 Arrays bidimensionales
 *
 * 9. Realiza un programa que sea capaz de rotar todos los elementos de una matriz
 *    cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
 *    12 filas por 12 columnas y debe contener números generados al azar entre 0 y 100.
 * 
 * @author Luis José Sánchez
 * 
 */

public class S72Exercise09 {

	public static void main(String[] args) {
 
		int[][] n = new int[12][12];
		int capa, i, j, aux1, aux2;


		// genera el array y lo muestra /////////////////////////
		
		System.out.println("Array original");
		System.out.println("--------------");

		for(i = 0; i < 12; i++) {
			for(j = 0; j < 12; j++) {
				n[i][j] = (int)(Math.random()*101);
				System.out.printf("%5d", n[i][j]);
				}
			System.out.println();
		}
			
				
		// rotación /////////////////////////////////////////////

		for(capa = 0; capa < 6; capa++) {
			
			// rota por arriba
			aux1 = n[capa][11 - capa];
			for (i = 11 - capa; i > capa; i--)
				n[capa][i] = n[capa][i - 1];
				
			// rota por la derecha			
			aux2 = n[11 - capa][11 - capa];
			for (i = 11 - capa; i > capa + 1; i--)
				n[i][11 - capa] = n[i - 1][11 - capa];
			n[capa + 1][11 - capa] = aux1;
			
			// rota por abajo
			aux1 = n[11 - capa][capa];
			for (i = capa; i < 11 - capa - 1; i++)
				n[11 - capa][i] = n[11 - capa][i + 1];
			n[11 - capa][11 - capa - 1] = aux2;
				
			// rota por la izquierda
			for (i = capa; i < 11 - capa - 1; i++)
				n[i][capa] = n[i + 1][capa];
			n[11 - capa - 1][capa] = aux1;

		} // for capa


		// muestra el array resultante ///////////////////////////
		
		System.out.println("\n\nArray rotado en el sentido de las agujas del reloj");
		System.out.println("--------------------------------------------------");

		for(i = 0; i < 12; i++) {
			for(j = 0; j < 12; j++)
				System.out.printf("%5d", n[i][j]);
			System.out.println();
		}
		
    }
}
