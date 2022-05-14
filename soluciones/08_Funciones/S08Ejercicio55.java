public class S08Ejercicio55 {

  public static void main(String[] args) {
    final String[] a = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};
    
    for (String cadena : a) {
      System.out.print(cadena + " ");
    }
    
    System.out.println();
    
    for (String cadena : sinRepetir(a)) {
      System.out.print(cadena + " ");
    }
  }
  
  public static String[] sinRepetir(String[] s) {
    String[] vacio = {};
    if (s.length == 0) {
      return vacio;
    }
    
    String[] resultado = new String[s.length];
    
    resultado[0] = s[0];
    int j = 1;
    for (int i = 1; i < s.length; i++) {
      if (!contiene(resultado, s[i])) {
        resultado[j++] = s[i];
      }
    }
    
    return compacta(resultado);
  }
  
  public static boolean contiene(String[] lista, String cadena) {
     
    for (String elemento : lista) {
      if ((elemento != null) && (elemento.equals(cadena))) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Quita los elementos nulos consecutivos por el final.
   * 
   * @param s array que puede tener nulos al final
   * @return array sin nulos
   */
  public static String[] compacta(String[] s) {
    
    int i = s.length - 1;
    
    while (s[i] == null) {
      i--;
    }
    String[] resultado = new String[i + 1];
    System.arraycopy(s, 0, resultado, 0, i + 1);
    
    return resultado;
  }
}
