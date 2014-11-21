/**
 * 7.1 Arrays
 * 
 * 12. Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 *     A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
 *     Seguidamente el programa pedirá dos posiciones a las que llamaremos "inicial" y
 *     "final". Se debe comprobar que inicial es menor que final y que ambos números están
 *     entre 0 y 9. El programa deberá colocar el número de la posición inicial en la posición
 *     final, rotando el resto de números para que no se pierda ninguno. Al final se debe mostrar
 *     el array resultante.
 *
 * @author Luis José Sánchez
 */
public class S71Ejercicio12 {

  public static void main(String[] args) {
  
    int[] n = new int[10];
    int[] resultado = new int[10];
    int i;
    int nInicial;
    int nFinal;
    boolean valido;
    
    System.out.println("Introduzca 10 números separados por INTRO:");

    for (i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    // Muestra el array original.  
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    // Pide las posiciones inicial y final.
    do {
      valido = true;
      
      System.out.print("Introduzca la posición inicial (0 - 9): ");
      nInicial = Integer.parseInt(System.console().readLine());
      if ((nInicial < 0) || (nInicial > 9)) {
        System.out.println("Valor incorrecto, debe ser un número entre el 0 y el 9.");
        valido = false;
      }
  
      System.out.print("Introduzca la posición final (0 - 9): ");
      nFinal = Integer.parseInt(System.console().readLine());
      if ((nFinal < 0) || (nFinal > 9)) {
        System.out.println("Valor incorrecto, debe ser un número entre el 0 y el 9.");
        valido = false;
      }
      
      if (nInicial >= nFinal) {
        System.out.println("Valores incorrectos, la posición inicial debe ser menor que la posición final.");
        valido = false;
      }
    } while (!valido);

    // Muestra de nuevo el array original.
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    // Copia el array n en resultado.
    for (i = 0; i < 10; i++) {
      resultado[i] = n[i];
    }
    
    resultado[nFinal] = n[nInicial];
    
    for (i = nFinal + 1; i < 10; i++)
      resultado[i] = n[i - 1];
    
    resultado[0] = n[9];
    
    for (i = 0; i < nInicial; i++)
      resultado[i + 1] = n[i];
    
    // Muestra el resultado.
    System.out.println("\nArray resultante:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("│%4d ", resultado[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");  
  }
}
