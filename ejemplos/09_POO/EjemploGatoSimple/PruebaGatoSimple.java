/**
 * PruebaGatoSimple.java
 * Programa que prueba la clase GatoSimple
 * @author Luis José Sánchez
 */
public class PruebaGatoSimple {
  public static void main(String[] args) {
    
    GatoSimple garfield = new GatoSimple("macho");
    
    System.out.println("hola gatito");
    garfield.maulla();
    System.out.println("toma tarta");
    garfield.come("tarta selva negra");
    System.out.println("toma pescado, a ver si esto te gusta");
    garfield.come("pescado");
    
    GatoSimple tom = new GatoSimple("macho");
    
    System.out.println("Tom, toma sopita de verduras");
    tom.come("sopa de verduras");
    
    GatoSimple lisa = new GatoSimple("hembra");
    
    System.out.println("gatitos, a ver cómo maulláis");
    garfield.maulla();
    tom.maulla();
    lisa.maulla();
    
    garfield.peleaCon(lisa);
    lisa.peleaCon(tom);
    tom.peleaCon(garfield);
  }
}
