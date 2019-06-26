public abstract class Vehiculo {
  
  // atributos de clase
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;
  
  // atributos de instancia
  private int kilometrosRecorridos;
  
  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }

  /**
   * Hace que un vehículo recorra una distancia determinada.
   * <p>
   * Cuando un vehículo recorre una distancia <code>k</code>, se
   * incrementan su propio cuentakilómetros, es decir, su atributo
   * <code>kilometrosRecorridos</code> y también se incrementa la cuenta
   * global de kilómetros que recorren todos los vehículos, es decir, el
   * atributo de clase <code>kilometrosTotales</code>.
   *
   * @param k kilómetros a recorrer
   */
  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
}
