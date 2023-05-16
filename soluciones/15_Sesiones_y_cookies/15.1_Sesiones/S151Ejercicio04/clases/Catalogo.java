package clases;

import java.util.ArrayList;

public class Catalogo {
  private ArrayList<Producto> productos = new ArrayList<Producto>();
  
  public void cargaDatos() {
    productos.clear();
    productos.add(new Producto(1, "Pelikan Souvëran M-1000", 545, "pelikan.jpg"));
    productos.add(new Producto(2, "Parker Duofold International", 406, "parkerduo.jpg"));
    productos.add(new Producto(3, "Visconti Van Gogh", 180, "visconti.jpg"));
    productos.add(new Producto(4, "Waterman Expert", 103.55, "waterman.jpg"));
    productos.add(new Producto(5, "Delta Dolce Vita", 480, "deltadolce.jpg"));
    productos.add(new Producto(6, "Montblanc Meisterstück 146", 580, "montblanc.jpg"));
    productos.add(new Producto(7, "Montegrappa Extra 1930", 1190, "montegrappa.jpg"));
  }

  public ArrayList<Producto> getProductos() {
    return productos;
  }
  
  public Producto productoConCodigo(int codigo) {
    for (Producto producto : productos) {
      if (producto.getCodigo() == codigo) {
        return producto;
      }
    }
    return null;
  }
}
