package clases;

public class ElementoDeCarrito {
  private Producto producto;
  private int cantidad;

  public ElementoDeCarrito(Producto producto, int cantidad) {
    this.producto = producto;
    this.cantidad = cantidad;
  }

  public Producto getProducto() {
    return producto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void incrementaCantidad(int cantidad) {
    this.cantidad += cantidad;
  }
  
  
}
