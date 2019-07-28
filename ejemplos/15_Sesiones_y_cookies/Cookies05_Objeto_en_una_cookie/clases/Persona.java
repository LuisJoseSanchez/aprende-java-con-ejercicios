package clases;

public class Persona implements java.io.Serializable {
  public String nombre;
  public String cargo;

  public Persona() {
  }
  
  public Persona(String nombre, String cargo) {
    this.nombre = nombre;
    this.cargo = cargo;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + ", Cargo: " + cargo;
  }
}
