public class Ave extends Animal {
  
  public Ave() {
    super(Sexo.HEMBRA);
  }

  public Ave(Sexo s) {
    super(s);
  }
  
  public void ponHuevo() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("Soy macho, no puedo poner huevos");
    } else {
      System.out.println("Ahi va eso... un huevo");
    }
  }
  
  public void limpiate() {
    System.out.println("Me estoy limpiando las plumas");
  }
  
  public void vuela() {
    System.out.println("Estoy volando");
  }
}
