public class S05Ejercicio60 {
  public static void main(String[] args) {

    System.out.print("Introduzca la altura de los calcetines: ");
    int altura = Integer.parseInt(System.console().readLine());

    for (int i = 0; i < altura - 2; i++) {
      System.out.println("***     ***");
    }

    for (int i = 0; i < 2; i++) {
      System.out.println("******  ******");
    }

  }
}
