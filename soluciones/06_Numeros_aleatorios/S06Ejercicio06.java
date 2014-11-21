/**
 * 6. Números aleatorios
 * 
 * 6. Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe *    adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el *    programa dirá cuántas oportunidades quedan y si el número introducido es menor o  *    mayor que el que ha pensado.
 *
 * @author Luis José Sánchez
 */
public class S06Ejercicio06 {
  public static void main(String[] args) {
    
    int oportunidades = 5;
    int numeroIntroducido;
    boolean acertado = false;
    int numeroMisterioso = (int)(Math.random() * 101);
    
    System.out.println("Estoy pensando un número del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.");

    do {
      System.out.print("Introduce un número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      oportunidades--;

      if ( (numeroIntroducido > numeroMisterioso) && (oportunidades > 0) ){
        System.out.println("El número que estoy pensando es menor que " + numeroIntroducido);
        System.out.println("Te quedan " + oportunidades + " oportunidades.");
      }
      
      if ( (numeroIntroducido < numeroMisterioso) && (oportunidades > 0) ){
        System.out.println("El número que estoy pensando es mayor que " + numeroIntroducido);
        System.out.println("Te quedan " + oportunidades + " oportunidades.");
      }
      
      if (numeroIntroducido == numeroMisterioso) {
        acertado = true;
        System.out.println("¡Enhorabuena! ¡has acertado!");
      }
    } while (!acertado && (oportunidades > 0));
    
    if (!acertado) {
      System.out.println("Lo siento, no has acertado, el número que estaba pensando era el " + numeroMisterioso);
    }
  }
}
