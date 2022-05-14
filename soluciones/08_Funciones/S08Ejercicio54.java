public class S08Ejercicio54 {

  public static void main(String[] args) {
    System.out.println(ocurrencias(8, 4672));
    System.out.println(ocurrencias(5, 5251535));
    System.out.println(ocurrencias(2, 123456));

    final int[] a = {714, 81, 9, 11};
    System.out.println(ocurrencias(1, a));
    
    final int[] b = {42, 13, 12345, 4};
    System.out.println(ocurrencias(4, b));
    
    final int[] c = {6, 66, 666};
    System.out.println(ocurrencias(6, c));
  }
  
  public static int ocurrencias(int digito, int n) {
    int repetido = 0;
    
    while (n > 0) {
      if ((n % 10) == digito) {
        repetido++;
      }
      n = n/10;
    }

    return repetido;
  }
  
  public static int ocurrencias(int digito, int[] a) {
    int repetido = 0;
    
    for (int n : a) {
      repetido += ocurrencias(digito, n);
    }
    
    return repetido;
  }
}
