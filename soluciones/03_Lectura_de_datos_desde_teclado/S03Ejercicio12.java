/**
 * 3. Lectura de datos desde teclado
 *
 * 12.  Realiza un programa que calcule la nota que hace falta sacar en el segundo
 *      examen de la asignatura **Programación** para obtener la media deseada.
 *      Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la
 *      del segundo examen un 60%.
 * 
 *      Ejemplo 1:
 *      Introduce la nota del primer examen: 7
 *      ¿Qué nota quieres sacar en el trimestre? 8.5
 *      Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
 * 
 *      Ejemplo 2:
 *      Introduce la nota del primer examen: 8
 *      ¿Qué nota quieres sacar en el trimestre? 7
 *      Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
 *
 * @author Luis José Sánchez
 */
public class S03Ejercicio12 {
  public static void main(String[] args) {
    System.out.print("Introduzca la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("¿Qué nota quiere sacar en el trimestre? ");
    double notaFinal = Double.parseDouble(System.console().readLine());
    
    // La nota final se calcula de esta forma:
    // notaFinal = ((nota1 * 40) + (nota2 * 60)) / 100
    // Por tanto, despejando nota2 tenemos:
    // nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60
    double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    
    System.out.println("Para tener un " + notaFinal + " en el trimestre");
    System.out.println(" necesita sacar un " + nota2 + " en el segundo examen.");
  }
}
