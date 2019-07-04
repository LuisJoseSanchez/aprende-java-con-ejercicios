import java.util.ArrayList;

public class S10Ejercicio23 {

  public static void main(String[] args) {
    ArrayList<Figura> figuras = new ArrayList<>();

    figuras.add(new Figura("Dama", 9, 1));
    figuras.add(new Figura("Torre", 5, 2));
    figuras.add(new Figura("Alfil", 3, 2));
    figuras.add(new Figura("Caballo", 2, 2));
    figuras.add(new Figura("Peón", 1, 8));

    System.out.println("Fichas capturadas por el jugador:");

    int capturasTotales = (int) (Math.random() * 16);
    int contadorCapturas = 0;
    int peonesTotales = 0;

    do {
      // Genera una captura aleatoria
      Figura figuraAux = figuras.get((int) (Math.random() * figuras.size()));
      if (figuraAux.esCapturable()) {
        figuraAux.captura();
        System.out.println(figuraAux);
        contadorCapturas++;
        peonesTotales += figuraAux.getValor();
      }
    } while (contadorCapturas < capturasTotales);

    System.out.println("Puntos totales: " + peonesTotales);
  }

}
