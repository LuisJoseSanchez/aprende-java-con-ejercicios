public class PruebaParametrosArray {
  
  public static void main(String[] args) {
    
    int n[] = {8, 33, 200, 150, 11};
    
    muestraArray(n);
    incrementa(n);
    muestraArray(n);
  }
  
  public static void muestraArray(int x[]) {
    
    for (int i = 0; i < x.length; i++)
      System.out.print(x[i] + " ");
      System.out.println();
  }
  
  public static void incrementa(int x[]) {
      
    for (int i = 0; i < x.length; i++)
      x[i]++;
  }
}
