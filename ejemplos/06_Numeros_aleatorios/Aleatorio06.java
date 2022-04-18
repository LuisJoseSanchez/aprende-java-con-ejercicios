/**
 *  Generación de números aleatorios.
 *
 *  @author Luis José Sánchez
 */
public class Aleatorio06 {
  public static void main(String[] args) {
    System.out.println("Genera al azar piedra, papel o tijera:");
    
    switch((int)(Math.random() * 3)) {
      case 0:
        System.out.println("piedra");
        break;
      case 1:
        System.out.println("papel");
        break;
      case 2:
        System.out.println("tijera");
        break;
      default:
    }
  }
}
