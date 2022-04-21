/**
 * 6. Números aleatorios
 * 
 * Solución al ejercicio 15.
 * 
 * "Aprende Java con Ejercicios" (https://leanpub.com/aprendejava)
 *
 * @author Luis José Sánchez
 */
public class S06Ejercicio15 {
  public static void main(String[] args) {
    
    int notas = 4 * (int)(Math.random() * 7 + 1);
    String nota = "";
    String primeraNota = "";

    for (int contadorNota = 1; contadorNota <= notas; contadorNota++) {
      switch((int)(Math.random() * 7)) {
        case 0:
          nota = "do";
          break;
        case 1:
          nota = "re";
          break;
        case 2:
          nota = "mi";
          break;
        case 3:
          nota = "fa";
          break;
        case 4:
          nota = "sol";
          break;
        case 5:
          nota = "la";
          break;
        case 6:
          nota = "si";
          break;
        default:
      }

      if (contadorNota == 1) {
        primeraNota = nota;
      }

      if (contadorNota == notas) {
        nota = primeraNota;
      }

      System.out.print(nota + " ");

      if ( contadorNota == notas ) {
        System.out.print("||");
      } else if ( contadorNota % 4 == 0 ) {
        System.out.print("| ");
      }
      
    } // for
  }
}
