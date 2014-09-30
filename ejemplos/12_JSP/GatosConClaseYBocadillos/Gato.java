/* Gato.java (proyecto GatosConClaseYBocadillos) */

package daw1;

public class Gato {
  private String nombre;
  private String imagen;

  public Gato(String nombre, String imagen) {
    this.nombre = nombre;
    this.imagen = imagen;
  }

  public String getNombre() {
    return nombre;
  }

  public String getImagen() {
    return imagen;
  }

  @Override
  public String toString() {
    return "<div class=\"acciongato\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"arrow_box\">&nbsp;Hola, soy " + nombre + "&nbsp;</div></div>";
  }
  
  public String maulla() {
    return "<div class=\"acciongato\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"arrow_box\">&nbsp;Miauuuuuuuu&nbsp;</div></div>";
  }
  
  public String come(String comida) {
    return "<div class=\"acciongato\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"arrow_box\">&nbsp;Estoy comiendo " + comida + "&nbsp;</div></div>";
  }
}
