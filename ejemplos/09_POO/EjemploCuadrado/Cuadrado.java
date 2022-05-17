/**
 * Cuadrado.java
 * Definición de la clase Cuadrado
 * @author Luis José Sánchez
 */
public class Cuadrado {
  
  private int lado;
    
  public Cuadrado(int l) {
    this.lado = l;
  }
  
  void setLado(int l) {
    this.lado = l;
  }
  
  @Override
  public String toString() {
    
    int i, espacios;
    String resultado = "";

    for (i = 0; i < this.lado; i++) {
      resultado += "██";
    }
    resultado += "\n";

    for (i = 1; i < this.lado - 1; i++) {
      resultado += "██";
      for (espacios = 1; espacios < this.lado - 1; espacios++) {
        resultado += "  ";
      }
      resultado += "██\n";
    }
        
    for (i = 0; i < this.lado; i++) {
      resultado += "██";
    }
    resultado += "\n";
    
    return resultado;
  }
}
