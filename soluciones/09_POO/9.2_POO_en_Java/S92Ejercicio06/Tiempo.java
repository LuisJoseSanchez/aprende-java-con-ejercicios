/**
 * Definición de la clase <code>Tiempo</code>.
 * <p>
 * Un objeto de la clase <code>Tiempo</code> se puede crear de dos
 * maneras diferentes. Se pueden indicar las horas, los minutos y los
 * segundos de la forma <code>new Tiempo(3, 20, 45)</code>, o bien se
 * puede indicar únicamente la cantidad de segundos de la forma <code>
 * new Tiempo(12045)</code> (ambos objetos definen el mismo intervalo
 * de tiempo).
 * <p>
 * Internamente, la clase solo almacena los segundos totales. A partir
 * de éstos, se puede deducir todo lo demás.
 * 
 * @author Luis José Sánchez
 */
public class Tiempo {
  
  private int segundos;
  
  public Tiempo(int horas, int minutos, int segundos) {
    this.segundos = (horas * 3600) + (minutos * 60) + segundos;
  }
  
  public Tiempo(int s) {
    this.segundos = s;
  }
    
  public String toString() {
    int segundos = this.segundos;
    int horas = segundos / 3600;
    segundos -= horas * 3600;
    int minutos = segundos / 60;
    segundos -= minutos * 60;
    
    if (this.segundos < 0) {
      return "-(" + (-horas) + "h " + (-minutos) + "m " + (-segundos) + "s)";
    } else {
      return horas + "h " + minutos + "m " + segundos + "s";
    }
  }

  private int getSegundos() {
    return this.segundos;
  }
  
  public Tiempo suma(Tiempo t) {
    return new Tiempo(this.segundos + t.getSegundos());
  }

  public Tiempo resta(Tiempo t) {
    return new Tiempo(this.segundos - t.getSegundos());
  }
}

