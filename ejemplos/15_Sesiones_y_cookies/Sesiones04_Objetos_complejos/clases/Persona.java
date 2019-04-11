package clases;

public class Persona {
  public String nombre;
  public String cargo;

  public Persona(String nombre, String cargo) {
    this.nombre = nombre;
    this.cargo = cargo;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + ", Cargo: " + cargo;
  }
}
