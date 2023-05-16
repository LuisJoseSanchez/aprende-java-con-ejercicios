package clases;

public class Producto {
  private int codigo;
  private String nombre;
  private double precio;
  private String imagen;

  public Producto(int codigo, String nombre, double precio, String imagen) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.precio = precio;
    this.imagen = imagen;
  }

  public int getCodigo() {
    return codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public String getImagen() {
    return imagen;
  }
  
  
}
