
public class Carta implements Comparable<Carta>{

  private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
  private static String[] p = {"bastos", "copas", "espadas", "oros"};
  
  private Integer numero;
  private String palo;

  public Carta() {
    this.numero = (int)(Math.random()*10);
    this.palo = p[(int)(Math.random()*4)];
  }
  
  public int getNumero() {
    return numero;
  }

  public String getFigura() {
    return n[numero];
  }

  public String getPalo() {
    return palo;
  }

  public String toString() {
    return n[numero] + " de " + palo;
  }

  public int compareTo(Carta c) {
    if (palo.equals(c.getPalo())) {
      return numero.compareTo(c.getNumero());
    } else {
      return palo.compareTo(c.getPalo());
    }
  }
}
