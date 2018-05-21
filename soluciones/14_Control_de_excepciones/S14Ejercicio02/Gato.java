public class Gato {
  
  private String color;
  private String raza;
  private String sexo;

  public Gato(String s) {
    this.sexo = s;
  }
  
  public void maulla() {
    System.out.println("Miauuuu");
  }
  
  public Gato apareaCon(Gato pareja) throws ExcepcionApareamientoImposible {
    if (this.sexo.equals(pareja.sexo)) {
      throw new ExcepcionApareamientoImposible();
    }
    
    String s = (int)(Math.random() * 2) ==  0 ? "hembra" : "macho";
    return new Gato(s);
  }

}
