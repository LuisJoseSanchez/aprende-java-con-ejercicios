public class Perro extends Mamifero {

  public Perro (Sexo s) {
    super(s);
  }

  public Perro () {
    super(Sexo.HEMBRA);
  }

  public void ladra() {
    System.out.println("Guau guau");
  }

  public void dameLaPata() {
    System.out.println("Toma mi patita");
  }

  public void caza() {
    System.out.println("Estoy cazando perdices");
  }
}
