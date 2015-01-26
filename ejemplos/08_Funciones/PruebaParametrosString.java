public class PruebaParametrosString {
  
  public static void main(String[] args) {
    
    String frase = "hola";
    
    System.out.println(frase);
    cambia(frase);
    System.out.println(frase);
  }
  
  public static void cambia(String frase) {
      
      frase = "adiós";  
  }
}
