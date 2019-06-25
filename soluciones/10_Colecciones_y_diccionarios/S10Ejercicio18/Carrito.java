import java.util.ArrayList;

public class Carrito {

  ArrayList<Elemento> a = new ArrayList<>();

  public void agrega(Elemento e) {
    boolean encontrado = false;
    
    for (Elemento elemento : a) {

      if (elemento.getProducto().equals(e.getProducto())) {
        elemento.setCantidad(elemento.getCantidad() + e.getCantidad());
        encontrado = true;
      }
    }
    if (!encontrado) {
      a.add(e);
    }
  }

  public int numeroDeElementos() {
    return a.size();
  }

  public double importeTotal() {
    double total = 0;
    for (Elemento e : a) {

      total += e.getPrecio() * e.getCantidad();

    }
    return total;
  }

  @Override
  public String toString() {
    String pinta = "Contenido del carrito\n=====================\n";
    for (Elemento e : a) {
      pinta += e + "\n";
    }
    return pinta;
  }
}
