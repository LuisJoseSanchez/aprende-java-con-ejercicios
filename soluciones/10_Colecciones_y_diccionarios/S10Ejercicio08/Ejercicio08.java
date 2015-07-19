/**
 * 8. Realiza un programa que escoja al azar 10 cartas de la baraja
 *    española (10 objetos de la clase <code>Carta</code>). Emplea un
 *    objeto de la clase <code>ArrayList</code> para almacenarlas y
 *    asegúrate de que no se repite ninguna.
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
      } while (c.contains(cartaAux));
      
      c.add(cartaAux);
    }
      
    for (Carta miCarta: c) {
      System.out.println(miCarta);
    }
  }
}
