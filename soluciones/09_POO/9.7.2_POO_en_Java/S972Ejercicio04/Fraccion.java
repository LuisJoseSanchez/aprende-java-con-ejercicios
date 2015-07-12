public class Fraccion {
  
  private int signo;
  private int numerador;
  private int denominador;
  
  public Fraccion(int n, int d) {
    if (d == 0) {
      System.out.println("Una fracción no puede tener como denominador el número 0");
    } else {
      if (n * d < 0) {
        this.signo = -1;
      } else {
        this.signo = 1;
      }
      this.numerador = Math.abs(n);
      this.denominador = Math.abs(d);
    }
  }

  int getNumerador(){
    return this.numerador;
  }
  
  int getDenominador(){
    return this.denominador;
  }
  
  public String toString() {
    if (signo == -1) {
      return "-" + this.numerador + "/" + this.denominador;
    } else {
      return this.numerador + "/" + this.denominador;
    }
  }

  public Fraccion invierte() {
    return new Fraccion(this.signo * this.denominador, this.numerador);
  }
  
  // multiplicación por un escalar
  public Fraccion multiplica(int n) {
    return new Fraccion(this.signo * this.numerador * n, this.denominador);
  }

  // multiplicación por una fracción
  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
  }

  // división entre un escalar
  public Fraccion divide(int n) {
    return new Fraccion(this.signo * this.numerador, this.denominador * n);
  }

  // división entre una fracción
  public Fraccion divide(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getDenominador(), denominador * f.getNumerador());
  }

  // simplifica una fracción
  // los valores del numerador y denominador de la fracción que se simplifica quedan cambiados
  public Fraccion simplifica() {
    
    int n = this.numerador;
    int d = this.denominador;
      
    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while (((n % i) == 0) && ((d % i) == 0)) {
        n /= i;
        d /= i;
      }
    }
        
    this.numerador = n;
    this.denominador = d;
        
    return this;
  }
}
