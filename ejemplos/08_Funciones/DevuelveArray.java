public class DevuelveArray {
  
  public static void main(String[] args) {
    
    int n[] = {8, 33, 200, 150, 11};
    
    muestraArray(n);
    muestraArray(mitad(n));
  }
  
  public static void muestraArray(int x[]) {
    
    for (int i = 0; i < x.length; i++)
      System.out.print(x[i] + " ");
      System.out.println();
  }
  
  public static int[] mitad(int x[]) {
    
    int n[] = new int[x.length/2];
    
    for (int i = 0; i < x.length/2; i++)
      n[i] = x[i];
      
    return n;
  }
}
