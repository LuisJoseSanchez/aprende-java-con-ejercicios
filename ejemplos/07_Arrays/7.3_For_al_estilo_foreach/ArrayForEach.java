public class ArrayForEach {
	public static void main(String[] args) {

		double[] nota = new double[4];
		double suma = 0;

		System.out.println("Para calcular la nota media necesito saber la nota de todos sus exámenes.");

		for (int i = 0; i < 4; i++) {
			System.out.print("Introduzca la nota del examen nº " + (i + 1) + ": ");
			nota[i] = Double.parseDouble(System.console().readLine());
		}

		System.out.println("Sus notas son: ");
		for (double n : nota) {
			System.out.print(n + "  ");
			suma += n;
		}
		System.out.println("\nLa media es " + suma / 4);
	}
}
