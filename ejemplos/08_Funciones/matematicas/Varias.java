package matematicas;

public class Varias {
	
	public static boolean esPrimo(int x) {
		
		boolean esPri = true;
		
		for (int i = 2; i < x; i++)
			if ((x % i) == 0) esPri = false;
		
		return esPri;	
	}
	
	public static int digitos(int x) {
		
		if (x == 0)
			return 1;
		else {
			int n = 0;
			while (x > 0) {
				x = x / 10;
				n++;
			}
			return n;
		}	
	}
}
