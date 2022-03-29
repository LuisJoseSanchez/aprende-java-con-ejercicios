/**
 * 4. Sentencia Condicional
 *
 * 2. Realiza un programa que pida una hora por teclado y que muestre
 *    luego buenos días, buenas tardes o buenas noches según la hora.
 *    Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5
 *    respectivamente. Sólo se tienen en cuenta las horas, los minutos
 *    no se deben introducir por teclado.
 *
 * @author Luis José Sánchez
 */
public class S04Ejercicio02 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días");
    }
        
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes");
    }
      
    if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
      System.out.println("Buenas noches");
    }
      
    if ((hora >= 24) || (hora < 0)) {
      System.out.println("La hora introducida no es correcta.");
    }
  }
}
