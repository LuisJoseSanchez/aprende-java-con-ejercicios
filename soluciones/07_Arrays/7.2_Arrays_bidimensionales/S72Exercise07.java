/**
 * 7.2 Arrays bidimensionales
 *
 * 7. Mejora el juego "Busca el tesoro" de tal forma que si hay una mina a una
 *    casilla de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 * 
 * @author Luis José Sánchez
 */
public class S72Exercise07 {

  // Se definen constantes para representar el contenido de las celdas
  static final int VACIO = 0;
  static final int MINA = 1;
  static final int TESORO = 2;
  static final int INTENTO = 3;
  
  public static void main(String[] args) {

    int[][] cuadrante = new int[5][4];

    int x;
    int y;
    
    // Inicializa el array
    for(x = 0; x < 4; x++) {
      for(y = 0; y < 3; y++) {
        cuadrante[x][y] = VACIO;
      }
    }
    
    // Coloca la mina
    int minaX = (int)(Math.random()*4);
    int minaY = (int)(Math.random()*3);
    
    cuadrante[minaX][minaY] = MINA;
    // Para depuración:
    // System.out.println(minaX + ", " + minaY);
    
    // Coloca el tesoro
    int tesoroX;
    int tesoroY;
    
    do {
      tesoroX = (int)(Math.random()*4);
      tesoroY = (int)(Math.random()*3);
    } while ((minaX == tesoroX) && (minaY == tesoroY));
    
    cuadrante[tesoroX][tesoroY] = TESORO;
    
    // Juego
    System.out.println("¡BUSCA EL TESORO!");
    
    int oportunidades = 6;
    boolean salir = false;
    String c = "";
            
    do {
      // Pinta el cuadrante
      for(y = 3; y >= 0; y--) {
        System.out.print(y + "|");  
        for(x = 0; x < 5; x++) {
          if (cuadrante[x][y] == INTENTO) {
            System.out.print("X ");
          } else { 
            System.out.print("  ");
          }
        }
        System.out.println();   
      }
      System.out.println("  ----------\n  0 1 2 3 4\n");
      
      // Pide las coordenadas
      System.out.print("Coordenada x: ");
      x = Integer.parseInt(System.console().readLine());
      System.out.print("Coordenada y: ");
      y = Integer.parseInt(System.console().readLine());
      
      // Mira lo que hay en las coordenadas indicadas por el usuario
      switch(cuadrante[x][y]) {
        case VACIO:
          cuadrante[x][y] = INTENTO;
          if ((Math.abs(x - minaX) < 2) && (Math.abs(y - minaY) < 2)) {
            System.out.println("Cuidado, hay una mina cerca.");
          }
          break;
        case MINA:
          System.out.println("Lo siento, has perdido.");
          salir = true;
          break;
        case TESORO:
          System.out.println("Enhorabuena, has encontrado el tesoro."); 
          salir = true;  
      }
    } while (!salir);

    // Pinta el cuadrante
    for(y = 3; y >= 0; y--) {
      System.out.print(y + " ");
      for(x = 0; x < 5; x++) {
        switch(cuadrante[x][y]) {
          case VACIO:
            c = "  ";
            break;
          case MINA:
            c = "* ";
            break;
          case TESORO:
            c = "€ ";
            break;
          case INTENTO:
            c = "x ";
            break;
        }
        System.out.print(c);
      }      
      System.out.println();
    }
    System.out.println("  ----------\n  0 1 2 3 4\n");
  }
}
