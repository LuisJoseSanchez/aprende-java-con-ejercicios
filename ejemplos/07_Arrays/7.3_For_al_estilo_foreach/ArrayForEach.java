/**
 * Recorre un array con un for al estilo foreach.
 * 
 * @author Luis José Sánchez
 */
 
 public class ArrayForEach {
	public static void main(String[] args) {

    double[] nota = new double[4];
 
    System.out.println("Para calcular la nota media necesito saber la ");
    System.out.println("nota de cada uno de tus exámenes.");

    for (int i = 0; i < 4; i++) {
      System.out.print("Nota del examen nº " + (i + 1) + ": ");
      nota[i] = Double.parseDouble(System.console().readLine());
    }
    
    System.out.println("Tus notas son: ");
    
    double suma = 0;
    
		for (double n : nota) { // for al estilo foreach
			System.out.print(n + "  ");
			suma += n;
		}
    System.out.println("\nLa media es " + suma / 4);
	}
}
