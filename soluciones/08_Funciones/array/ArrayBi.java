/*
 * Se compilan los dos ficheros desde consola al mismo tiempo:
 * javac Array.java ArrayBi.java
 * De esta forma se pueden usar las funciones de Array en ArrayBi.
 * 
 */


package array;
import matematicas.*;

public class ArrayBi {
	
	
	
	public static void muestraArrayBiInt(int x[][]) {
		
		String formatoNumero = "%" + matematicas.Varias.digitos(maximoArrayBiInt(x)) + "d";

		for (int f = 0; f < x.length; f++) {
			for (int c = 0; c < x[0].length; c++)
				System.out.printf(formatoNumero + " ", x[f][c]);
			System.out.println();
		}
	}
	
	
	
	public static int[][] generaArrayBiInt(int filas, int columnas, int minimo, int maximo) {
			
		int[][] x = new int[filas][columnas];

		for(int i = 0; i < filas; i++)
			for(int j = 0; j < columnas; j++)
				x[i][j] = (int)(Math.random()*(maximo - minimo) + minimo + 1);
			
		return x;
	}



	public static int maximoArrayBiInt(int x[][]) {
		
		int maximo = Integer.MIN_VALUE;
		
		for (int f = 0; f < x.length; f++)
			for (int c = 0; c < x[0].length; c++)
				if (x[f][c] > maximo)
					maximo = x[f][c];
					
		return maximo;
	}



	public static int[] filaDeArrayBiInt(int x[][], int fila) {
		
		int[] f = new int[x[0].length];
		
		for (int c = 0; c < x[0].length; c++)
			f[c] = x[fila][c];
					
		return f;
	}	
	
	
	public static int[] columnaDeArrayBiInt(int x[][], int columna) {
		
		int[] c = new int[x.length];
		
		for (int f = 0; f < x.length; f++)
			c[f] = x[f][columna];
					
		return c;
	}
 
	
	
	public static int[] coordenadasEnArrayBiInt(int x[][], int n) {
		
		for (int f = 0; f < x.length; f++)
			for (int c = 0; c < x[0].length; c++)
				if (x[f][c] == n) {
					int[] coordenadas = {f, c};
					return coordenadas;
				}
				
		int[] coordenadas = {-1, -1};			
		return coordenadas;
	}



	public static boolean esPuntoDeSilla(int x[][], int i, int j) {
		
		int[] fila = filaDeArrayBiInt(x, i);
		int[] columna = columnaDeArrayBiInt(x, j);
		
		if ((Array.minimoArrayInt(fila) == x[i][j]) && (Array.maximoArrayInt(columna) == x[i][j]))
			return true;
		else
			return false;
	}
	


	public static int[] diagonal(int x[][], int fila, int columna, String direccion) {
		
		int elementos = 0, i, j;
		int[] diagonalAux = new int [1000];
		
		for (i = 0; i < x.length; i++)
			for (j = 0; j < x[0].length; j++)
				if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))
				  || (((columna - j) == (i - fila)) && (direccion.equals("neso"))) )
					diagonalAux[elementos++] = x[i][j];
		
						
		int[] diagonal = new int[elementos];
		for (j = 0; j < elementos; j++)
			diagonal[j] = diagonalAux[j];
			
		return diagonal;
	}
}
