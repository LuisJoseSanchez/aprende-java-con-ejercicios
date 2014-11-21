/**
 * 6. Números aleatorios
 * 
 * 11. Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la
 *     forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de
 *     suspensos, el número de suficientes, el número de bienes, etc.
 *
 * @author Luis José Sánchez
 */

public class S06Ejercicio11 {

  public static void main(String[] args) {
    
    int nota;
    int suspensos = 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;
    
    for(int i = 0; i < 20; i++) {
      
      nota = (int)(Math.random() * 5);
      
      switch(nota) {
        case 0:
          System.out.print("suspenso ");
          suspensos++;
          break;
        case 1:
          System.out.print("suficiente ");
          suficientes++;
          break;
        case 2:
          System.out.print("bien ");
          bienes++;
          break;
        case 3:
          System.out.print("notable ");
          notables++;
          break;
        case 4:
          System.out.print("sobresaliente ");
          sobresalientes++;
          break;
        default:
      }

    }
    
    System.out.println("\nNº de suspensos: " + suspensos);
    System.out.println("Nº de suficientes: " + suficientes);
    System.out.println("Nº de bienes: " + bienes);
    System.out.println("Nº de notables: " + notables);
    System.out.println("Nº de sobresalientes: " + sobresalientes);
  }
}
