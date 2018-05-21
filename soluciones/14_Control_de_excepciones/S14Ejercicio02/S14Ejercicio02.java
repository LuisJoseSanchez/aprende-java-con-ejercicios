public class S14Ejercicio02 {

  public static void main(String[] args) {
    Gato garfield = new Gato("macho");
    Gato tom = new Gato("macho");
    try {
      garfield.apareaCon(tom);
    } catch (ExcepcionApareamientoImposible eai) {
      eai.printStackTrace();
      System.out.println("Dos gatos del mismo sexo no se pueden aparear.");
    }
  }
  
}
