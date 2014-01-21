public class PruebaParametrosArray {
	
	public static void main(String[] args) {
		
		int n[] = {8, 33, 200, 150, 11};
		int m[] = new int[5];
		
		muestraArray(n);
		m = incrementa2(n);
		muestraArray(n);
		muestraArray(m);
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
	
	public static int[] incrementa2(int x[]) {
		int[] a = new int[x.length];
		
		for (int i = 0; i < x.length; i++)
			a[i] = x[i] + 1;
			
		return a;
	}
}
