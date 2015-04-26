/*
 * 8. Realiza un programa que escoja al azar 10 cartas de la baraja española (10
 *    objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 *    almacenarlas y asegúrate de que no se repite ninguna.
 *    
 *    @author Luis José Sánchez
 */

import java.util.ArrayList;

public class Ejercicio08 {

  public static void main(String[] args) {
    
    ArrayList<Carta> c = new ArrayList<Carta>();
    
    Carta cartaAux = new Carta();
    c.add(cartaAux);
    
    for (int i = 0; i < 9; i++) {
      do {
        cartaAux = new Carta();      
      } while (existeCarta(cartaAux, c));
      
      c.add(cartaAux);
    }
      
    for (Carta miCarta: c)  System.out.println(miCarta);
    
  } // main /////////////////////////////////////////////////////////
  
  
  // Comprueba si existe una determinada carta dentro de un ArrayList
  // de cartas
  public static boolean existeCarta(Carta c, ArrayList<Carta> cartas) {
    for (Carta car : cartas)
      if ( (c.getNumero().equals(car.getNumero()))
        && (c.getPalo().equals(car.getPalo())) ) {
        return true;
      }

    return false;
  }
}
