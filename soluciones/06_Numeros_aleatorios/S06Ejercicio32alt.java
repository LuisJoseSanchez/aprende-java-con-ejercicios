import java.util.Scanner;

public class S06Ejercicio32alt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la longitud del sendero en metros: ");
    int longitudSendero = Integer.parseInt(s.nextLine());

    int espaciosPorDelante = 6;

    for (int i = 0; i < longitudSendero; i++) {
      // Espacios por delante
      for (int j = 0; j < espaciosPorDelante; j++) {
        System.out.print(' ');
      }

      // Borde izquierdo del sendero
      System.out.print("🌴");

      // Parte interior del sendero
      int posicionObstaculo = -1;
      String obstaculo = "🌿"; // planta por defecto

      if ((int) (Math.random() * 2) == 0) { // hay obstáculo
        posicionObstaculo = (int) (Math.random() * 4);
        if ((int) (Math.random() * 2) == 0) { // piedra
          obstaculo = "💎";
        }
      }

      for (int j = 0; j < 4; j++) {
        System.out.print(j == posicionObstaculo ? obstaculo : ' ');
      }

      // Borde derecho del sendero
      System.out.println("🌴");

      espaciosPorDelante += (int) (Math.random() * 3) - 1;
    }
  }

}
