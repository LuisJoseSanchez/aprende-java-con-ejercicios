/**
 * 7. La máquina Eurocoin genera una moneda de curso legal cada vez que
 *    se pulsa un botón siguiendo la siguiente pauta: o bien coincide el
 *    valor con la moneda anteriormente generada - 1 céntimo, 2 céntimos,
 *    5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros -
 *    o bien coincide la posición – cara o cruz. Simula, mediante un
 *    programa, la generación de 6 monedas aleatorias siguiendo la pauta
 *    correcta. Cada moneda generada debe ser una instancia de la clase
 *    Moneda y la secuencia se debe ir almacenando en una lista.
 *    Ejemplo:
 *    2 céntimos – cara
 *    2 céntimos – cruz
 *    50 céntimos – cruz
 *    1 euro – cruz
 *    1 euro – cara
 *    10 céntimos – cara
 *    
 *    @author Luis José Sánchez
 */
import java.util.ArrayList;

public class Eurocoin {

  public static void main(String[] args) {
    ArrayList<Moneda> m = new ArrayList<Moneda>();
    
    Moneda monedaAux = new Moneda();
    m.add(monedaAux);
    
    String ultimaPosicion = monedaAux.getPosicion();
    String ultimaCantidad = monedaAux.getCantidad();
    
    for (int i = 0; i < 5; i++) {
      do {
        monedaAux = new Moneda();
      } while (!((monedaAux.getPosicion()).equals(ultimaPosicion)) && !((monedaAux.getCantidad()).equals(ultimaCantidad)));
      
      m.add(monedaAux);
      ultimaPosicion = monedaAux.getPosicion();
      ultimaCantidad = monedaAux.getCantidad();
    }
    
    for (Moneda mo : m) {
      System.out.println(mo);
    }
  }
}
