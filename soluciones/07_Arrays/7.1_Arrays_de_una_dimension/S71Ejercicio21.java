public class S71Ejercicio21 {

  public static void main(String[] args) {
    // Crea el array con valores aleatorios
    int[] n = new int[15];

    for (int i = 0; i < 15; i++) {
      n[i] = (int) (Math.random() * 501);
    }

    System.out.println("Array original:");

    for (int i = 0; i < 15; i++) {
      System.out.print(n[i] + "  ");
    }

    // Cincueriza el array
    for (int i = 0; i < 15; i++) {
      while (n[i] % 5 != 0) {
        n[i]++;
      };
    }

    // Muestra el resultado
    System.out.println("\n\nArray resultado:");

    for (int i = 0; i < 15; i++) {
      System.out.print(n[i] + "  ");
    }
  }

}
