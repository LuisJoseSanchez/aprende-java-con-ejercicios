import java.text.DecimalFormat;

public class Movil extends Terminal {

  private String tarifa;
  private double totalTarificado;

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.totalTarificado = 0;
  }

  @Override
  public void llama(Terminal t, int segundosDeLlamada) {
    super.llama(t, segundosDeLlamada);
    double minutos = (double) segundosDeLlamada / 60;

    switch (this.tarifa) {
      case "rata":
        this.totalTarificado += minutos * 0.06;
        break;
      case "mono":
        this.totalTarificado += minutos * 0.12;
        break;
      case "bisonte":
        this.totalTarificado += minutos * 0.30;
        break;
      default:
    }
  }

  @Override
  public String toString() {
    DecimalFormat formatoEuros = new DecimalFormat("0.00");
    return "Nº " + this.getNumero()
            + " - " + this.getTiempoDeConversacion()
            + "s de conversación - tarificados "
            + formatoEuros.format(this.totalTarificado) + " euros";
  }

}
