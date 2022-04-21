/**
 * Aprende Java con Ejercicios (https://leanpub.com/aprendejava)
 * 
 * Capítulo 6. Números aleatorios.
 * 
 * Ejercicio 18
 * 
 * @author Luis José Sánchez
 */
public class S06Ejercicio18Alternativo {
  public static void main(String[] args) {

    // Todavía no se han visto arrays y por eso el ejercicio está implementado
    // exclusivamente con variables. Con arrays es mucho más corto.
    
    int c1;
    int c2;
    int c3;
    
    String color1 = "";
    String color2 = "";
    String color3 = "";

    do {
      c1 = (int)(Math.random() * 6);
      c2 = (int)(Math.random() * 6);
      c3 = (int)(Math.random() * 6);
    } while ((c1 == c2) || (c1 == c3) || (c2 == c3));

    for (int i = 0; i < 3; i++) {
      String color = "";
      int c = 0;

      switch(i) {
        case 0:
          c = c1;
          break;
        case 1:
          c = c2;
          break;
        case 2:
          c = c3;
          break;
        default:
      }
      
      switch(c) {
        case 0:
          color = "rojo";
          break;
        case 1:
          color = "azul";
          break;
        case 2:
          color = "verde";
          break;
        case 3:
          color = "amarillo";
          break;
        case 4:
          color = "violeta";
          break;
        case 5:
          color = "naranja";
          break;
        default:
      }
      
      switch(i) {
        case 0:
          color1 = color;
          break;
        case 1:
          color2 = color;
          break;
        case 2:
          color3 = color;
          break;
        default:
      }
    }

    System.out.print(color1 + ", " + color2 + ", " + color3);
  }
}
