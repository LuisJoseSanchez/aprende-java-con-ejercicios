/**
 * 1. Salida por pantalla
 *
 * 7. Igual que el programa anterior, pero esta vez la pirámide estará
 *    hueca (se debe ver únicamente el contorno hecho con asteriscos).
 *
 * @author Luis José Sánchez
 * 
 */
public class S01Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("\033[34m"); // pintamos en azul
    
    System.out.println("    *");
    System.out.println("   * *");
    System.out.println("  *   *");
    System.out.println(" *     *");
    System.out.println("*********");
    
    System.out.println("\033[37m"); // volvemos al blanco
  }
}
