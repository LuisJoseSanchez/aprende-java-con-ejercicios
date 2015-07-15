/**
 * Definición de la clase Zona
 * 
 * @author Luis José Sánchez
 */
public class Zona {
  
  private int entradasPorVender;
  
  public Zona(int n){
    entradasPorVender = n;
  }
  
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  
  /**
   * Vende un número de entradas.
   * <p>
   * Comprueba si quedan entradas libres antes de realizar la venta.
   * 
   * @param n número de entradas a vender
   */
  public void vender(int n) {
    
    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, las entradas para esa zona están agotadas.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Sólo me quedan " + this.entradasPorVender
                          + " entradas para esa zona.");
    }
    
    if (this.entradasPorVender >= n) {
      entradasPorVender -= n;
      System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
    }
  }
}
