/**
 * 3. Lectura de datos desde teclado
 *
 * 6. Escribe un programa que calcule el área de un triángulo.
 *
 * @author Luis José Sánchez
 */
public class S03Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Área de un triángulo");
    System.out.println("--------------------");
    System.out.print("Por favor, introduzca la longitud de la base (cm): ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Inroduzca la altura (cm): ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El área del triángulo es " + (base * altura)/2 + " cm²");
  }
}
