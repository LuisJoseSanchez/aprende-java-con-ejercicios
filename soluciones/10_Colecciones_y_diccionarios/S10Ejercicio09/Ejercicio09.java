/*
 * 9. Modifica el programa anterior de tal forma que las cartas se
 *    muestren ordenadas. Primero se ordenarán por palo: bastos,
 *    copas, espadas, oros. Cuando coincida el palo, se ordenará por
 *    número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 *    
 *    @author Luis José Sánchez
 */

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio09 {

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
    
    Collections.sort(c);
    
    for (Carta miCarta: c)  System.out.println(miCarta);
    
  } // main /////////////////////////////////////////////////////////
  
  
  // Comprueba si existe una determinada carta dentro de un ArrayList
  // de cartas
  public static boolean existeCarta(Carta c, ArrayList<Carta> cartas) {
    for (Carta car : cartas) {
      if ( (c.getNumero() == car.getNumero()) && (c.getPalo().equals(car.getPalo())) ) {
        return true;
      }
    }
         
    return false;
  }
}
