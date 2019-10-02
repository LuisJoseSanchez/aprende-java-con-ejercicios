/**
 * Operador ternario
 *
 * @author Luis J. Sánchez
 */
public class OperadorTernario {
  public static void main(String[] args) {   
    System.out.print("Introduzca la nota numérica: ");
    int notaNumerica = Integer.parseInt(System.console().readLine());
    
    /*
     
    // Versión con if - else
    
    String notaCadena;
    
    if (notaNumerica < 5) {
      notaCadena = "suspenso";
    } else {
      notaCadena = "aprobado";
    }
    */
    
    // Versión con el operador ternario
    
    String notaCadena = notaNumerica < 5 ? "suspenso" : "aprobado";
    
    System.out.println("Nota: " + notaCadena);
  }
}
