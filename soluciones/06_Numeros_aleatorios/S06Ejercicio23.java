/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 6. Números aleatorios.
 * 
 * Ejercicio 23
 * 
 * @author Luis José Sánchez
 */
public class S06Ejercicio23 {
  public static void main(String[] args) {

    String dado = "";
    
    for (int i = 0; i < 5; i++) {
      switch((int)(Math.random() * 6)) {
        case 0:
          dado = "As";
          break;
        case 1:
          dado = "K";
          break;
        case 2:
          dado = "Q";
          break;
        case 3:
          dado = "J";
          break;
        case 4:
          dado = "7";
          break;
        case 5:
          dado = "8";
          break;
        default:
      }
      System.out.print(dado + " ");
    }
  }
}
