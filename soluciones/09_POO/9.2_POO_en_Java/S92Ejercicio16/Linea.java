class Linea {

  private Punto origen;
  private Punto fin;

  public Linea(Punto origen, Punto fin) {
    this.origen = origen;
    this.fin = fin;
  }

  @Override
  public String toString() {
    return "Línea formada por los puntos " + origen + " y " + fin;
  }
  
}
