class Ameba {
  int peso; // peso en microgramos

  public Ameba() {
    this.peso = 3;
  }

  void come(int pesoComida) {
    this.peso += pesoComida - 1;
  }
  
  void come(Ameba a) {
    this.peso += a.peso - 1;
    a.peso = 0; // la ameba comida se queda sin sustancia
  }

  @Override
  public String toString() {
    return "Soy una ameba y peso " + peso + " microgramos.";
  }

}
