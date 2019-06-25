import java.util.Scanner;

public class S06Ejercicio27 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
    String jugador = s.nextLine();

    int mano = (int) (Math.random() * 3);
    String ordenador = "";
    
    switch (mano) {
      case 0:
        ordenador = "piedra";
        break;
      case 1:
        ordenador = "papel";
        break;
      case 2:
        ordenador = "tijera";
        break;
      default:
    }

    System.out.println("Turno del ordenador: " + ordenador);
    
    if (jugador.equals(ordenador)) {
      System.out.println("Empate");
    } else {
      int ganador = 2;
      switch (jugador) {
        case "piedra":
          if (ordenador.equals("tijera")) {
            ganador = 1;
          }
          break;
        case "papel":
          if (ordenador.equals("piedra")) {
            ganador = 1;
          }
          break;
        case "tijera":
          if (ordenador.equals("papel")) {
            ganador = 1;
          }
          break;
        default:
          
      }
      
      if (ganador == 1) {
        System.out.println("Gana el jugador");
      } else {
        System.out.println("Gana el ordenador");
      }
      
    }
  }

}
