/**
 * PruebaAnimal.java
 * Programa que prueba la clase Animal y sus subclases
 * @author Luis José Sánchez
 */
public class PruebaAnimal {
  public static void main(String[] args) {
    
    Gato garfield = new Gato(Sexo.MACHO, "romano");
    Gato tom = new Gato(Sexo.MACHO);
    Gato lisa = new Gato(Sexo.HEMBRA);
    Gato silvestre = new Gato();
    
    System.out.println(garfield);
    System.out.println(tom);
    System.out.println(lisa);
    System.out.println(silvestre);
    
    silvestre.come();
    silvestre.come("pescado");
    
    Ave miLoro = new Ave();
    miLoro.aseate();
    miLoro.vuela();
    miLoro.come("hamburguesa");
    miLoro.come();
    
    Pinguino pingu = new Pinguino(Sexo.HEMBRA);
    pingu.aseate();
    pingu.vuela();
  }
}
