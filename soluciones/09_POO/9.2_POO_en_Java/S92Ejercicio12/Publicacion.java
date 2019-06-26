public class Publicacion {
  private String isbn;
  private String titulo;
  private int anio;

  public Publicacion(String isbn, String titulo, int anio) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.anio = anio;
  }

  @Override
  public String toString() {
    return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + anio;
  }  
}
