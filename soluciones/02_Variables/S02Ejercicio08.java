public class S02Ejercicio08 {
  public static void main(String[] args) {
    char l1 = 's';
    char l2 = 'a';
    char l3 = 'l';
    char l4 = 'u';
    char l5 = 'd';
    
    // La siguiente línea da error porque el resultado de sumar variables
    // de tipo carácter es un número entero.
    // String palabra = l1 + l2 + l3 + l4 + l5;
    
    // Se soluciona concatenando al principio la cadena vacía.
    String palabra = "" + l1 + l2 + l3 + l4 + l5;
    
    System.out.println(palabra);
  }
}
