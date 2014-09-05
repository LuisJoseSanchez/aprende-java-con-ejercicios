/**
 * 
 * 1. Salida por pantalla
 *
 * 9. Escribe un programa que pinte por pantalla alguna escena - el campo,
 *    la habitación de una casa, un aula, etc. - o algún objeto animado o
 *    inanimado - un coche, un gato, una taza de café, etc. Ten en cuenta
 *    que puedes utilizar caracteres como *, +, <, #, @, etc. ¡Échale
 *    imaginación!
 *
 * @author Luis José Sánchez
 * 
 */

public class S01Ejercicio09 {
  public static void main(String[] args) {

    String rojo = "\033[31m", verde = "\033[32m", naranja = "\033[33m";
    String azul = "\033[34m", morado = "\033[35m", blanco = "\033[37m";

    System.out.println(rojo);
    System.out.println("                        ██");
    System.out.println("    APRENDE JAVA      ██");
    System.out.println("   CON EJERCICIOS       ██\n" + naranja);
    System.out.println("  Luis José Sánchez" + azul + "  ████████████");
    System.out.println("                     ████████  ██");
    System.out.println("                     ████████████");
    System.out.println("                     ████████");
    System.out.println("░░░░░░░░░░░░░░░░░░░░░████████░░░░░░░░");  
    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    
    System.out.println("\033[37m"); // volvemos al blanco      
  }
}
