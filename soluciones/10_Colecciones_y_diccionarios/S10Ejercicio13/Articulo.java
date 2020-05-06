import java.util.Objects;

public class Articulo {
  private String codigo;
  private String descripcion;
  private double precioDeCompra;
  private double precioDeVenta;
  private int stock;

  public Articulo(String co, String de, double pc, double pv, int st) {
    this.codigo = co;
    this.descripcion = de;
    this.precioDeCompra = pc;
    this.precioDeVenta = pv;
    this.stock = st;
  }

  public Articulo(String co) {
    this.codigo = co;
  }

  public String getCodigo() {
    return codigo;
  }
  
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  
  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioDeCompra() {
    return precioDeCompra;
  }

  public void setPrecioDeCompra(double precioDeCompra) {
    this.precioDeCompra = precioDeCompra;
  }

  public double getPrecioDeVenta() {
    return precioDeVenta;
  }

  public void setPrecioDeVenta(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    String cadena = "------------------------------------------";
    cadena += "\nCódigo: " + this.codigo;
    cadena += "\nDescripción: " + this.descripcion;
    cadena += "\nPrecio de compra: " + this.precioDeCompra;
    cadena += "\nPrecio de venta: " + this.precioDeVenta;
    cadena += "\nStock: " + this.stock + " unidades";
    cadena += "\n------------------------------------------";
    return cadena;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 59 * hash + Objects.hashCode(this.codigo);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Articulo other = (Articulo) obj;
    if (!Objects.equals(this.codigo, other.codigo)) {
      return false;
    }
    return true;
  }
  
  
}


