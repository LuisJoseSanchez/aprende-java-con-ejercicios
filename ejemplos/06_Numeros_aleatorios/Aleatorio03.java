/**
*
*	Generación de números aleatorios.
*
*	@author Luis José Sánchez
*
**/

public class Aleatorio03 {
    
	public static void main(String[] args) {

	int	i;

	System.out.println("20 números aleatorios entre 0 y 9 (sin decimales):");
	for (i = 1; i <= 20; i++)
		System.out.print( (int)(Math.random()*10) + "  ");

	System.out.println();
    }
}


