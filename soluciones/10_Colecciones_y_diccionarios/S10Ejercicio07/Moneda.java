public class Moneda {
  private static String posiciones[] = {"cara", "cruz"};
  private static String cantidades[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
  private String cantidad;
  private String posicion;

  public Moneda() {
    this.posicion = posiciones[(int)(Math.random()*2)];
    this.cantidad = cantidades[(int)(Math.random()*8)];
  }

  public String getPosicion() {
    return this.posicion;
  }
  
  public String getCantidad() {
    return this.cantidad;
  }

  public String toString() {
    return this.cantidad + " - " + this.posicion;
  }
}
