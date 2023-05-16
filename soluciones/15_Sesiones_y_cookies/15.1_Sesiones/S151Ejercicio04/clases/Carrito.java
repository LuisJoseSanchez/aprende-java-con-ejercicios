package clases;

import java.util.ArrayList;

public class Carrito {

  private ArrayList<ElementoDeCarrito> elementos = new ArrayList<ElementoDeCarrito>();

  public Carrito() {
  }

  public Carrito(ArrayList<ElementoDeCarrito> elementos) {
    this.elementos = elementos;
  }

  public ArrayList<ElementoDeCarrito> getElementos() {
    return elementos;
  }

  public boolean existeElementoConCodigo(int codigo) {
    return this.posicionElementoConCodigo(codigo) != -1;
  }

  public void meteProductoConCodigo(int codigo) {
    if (this.existeElementoConCodigo(codigo)) {
      elementos.get(posicionElementoConCodigo(codigo)).incrementaCantidad(1);
    } else {
      Catalogo catalogo = new Catalogo();
      catalogo.cargaDatos();
      elementos.add(new ElementoDeCarrito(catalogo.productoConCodigo(codigo), 1));
    }
  }

  public void eliminaProductoConCodigo(int codigo) {
    if (existeElementoConCodigo(codigo)) {
      int i = 0;
      int posicion = 0;
      for (ElementoDeCarrito elemento : elementos) {
        if (elemento.getProducto().getCodigo() == codigo) {
          posicion = i;
        }
        i++;
      }
      elementos.remove(posicion);
    }
  }

  private int posicionElementoConCodigo(int codigo) {
    int i = 0;
    for (ElementoDeCarrito elemento : elementos) {
      if (elemento.getProducto().getCodigo() == codigo) {
        return i;
      }
      i++;
    }
    return -1;
  }
}
