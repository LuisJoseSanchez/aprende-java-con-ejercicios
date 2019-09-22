/**
 * PruebaCuadrado.java
 * Programa que prueba la clase Cuadrado
 * @author Luis José Sánchez
 */
public class PruebaCuadrado {
  public static void main(String[] args) {
    
    Cuadrado miCuadradito = new Cuadrado(5);
    System.out.println(miCuadradito);
    miCuadradito.setLado(10);
    System.out.println(miCuadradito);
  }
}
