class Incidencia {

  private int codigo;
  private String estado;
  private int puesto;
  private String problema;
  private String resolucion;

  private static int contadorCodigos = 1;
  private static int pendientes = 0;

  public Incidencia(int puesto, String problema) {
    this.puesto = puesto;
    this.problema = problema;
    this.estado = "Pendiente";
    this.codigo = contadorCodigos++;
    pendientes++;
  }

  void resuelve(String resolucion) {
    this.resolucion = resolucion;
    this.estado = "Resuelta";
    pendientes--;
  }

  @Override
  public String toString() {
    return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + problema
      + " - " + estado + (estado.equals("Resuelta") ? " - " + resolucion : "");
  }

  static int getPendientes() {
    return pendientes;
  }
}
