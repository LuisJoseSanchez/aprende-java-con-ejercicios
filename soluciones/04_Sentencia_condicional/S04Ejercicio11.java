/**
 * 4. Sentencia Condicional
 *
 * 11. Escribe un programa que dada una hora determinada (horas y minutos),
 *     calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Luis José Sánchez
 */
public class S04Ejercicio11 {

  public static void main(String[] args) {
    
    System.out.print("A continuación deberá introducir una hora del día, ");
    System.out.println("primero introducirá la hora y luego los minutos.");
    
    System.out.print("hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("minuto: ");
    int minuto = Integer.parseInt(System.console().readLine());

    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
            
    //System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + segundosHastaMedianoche + " segundos.");
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", hora, minuto, segundosHastaMedianoche);
  }
}
