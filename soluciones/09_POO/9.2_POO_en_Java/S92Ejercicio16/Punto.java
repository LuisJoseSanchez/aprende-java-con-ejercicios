public class Punto {

  private double x;
  private double y;

  public Punto(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
  
}
