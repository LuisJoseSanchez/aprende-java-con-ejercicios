/**
 * 4. Sentencia Condicional
 *
 * 8. Amplía el programa anterior para que diga la nota del boletín
 *    (insuficiente, suficiente, bien, notable o sobresaliente).
 *
 * @author Luis José Sánchez
 */
public class S04Ejercicio08ConElseIf {

  public static void main(String[] args) {

    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.print("Por favor, introduzca la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora introduzca la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por último introduzca la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f\n", media);
    
    if (media < 5) {
      System.out.print("Insuficiente");
    } else if (media < 6) {
      System.out.print("Suficiente");
    } else if (media < 7) {
      System.out.print("Bien");
    } else if (media < 9) {
      System.out.print("Notable");
    } else {
      System.out.print("Sobresaliente");
    }
  }
}
