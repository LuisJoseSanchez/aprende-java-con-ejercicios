/**
 * Coche.java
 * Definición de la clase Coche
 * @author Luis José Sánchez
 */

public class Coche {

  // atributo de clase
  private static int kilometrajeTotal = 0;
  
  // método de clase
  public static int getKilometrajeTotal() {
    return kilometrajeTotal;
  }
  
  private String marca;
  private String modelo;
  private int kilometraje;

  public Coche(String ma, String mo) {
    marca = ma;
    modelo = mo;
    kilometraje = 0;
  }
  
  public int getKilometraje() {
    return kilometraje;
  }

  /**
   * Recorre una determinada distancia.
   * 
   * @param km distancia a recorrer en kilómetros
   */  
  public void recorre(int km) {
    kilometraje += km;
    kilometrajeTotal += km;
  }
}
