/*
 *
 * Ejemplo de uso de la clase File
 * Calcula la media de los números que se encuentran en un fichero de texto.
 * El nombre del fichero se pasa como argumento en la línea de comandos.
 *
 */

import java.io.*;

class Media {

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Uso del programa: media FICHERO"); // suponemos que hemos llamado a la clase "media" en lugar de "EjemploFichero09"
			System.exit(-1); // sale del programa
		}
			
		try {		
			BufferedReader bf = new BufferedReader(new FileReader(args[0]));
			
			String linea = "0";
			int i = 0;
			double suma = 0;
			
			while (linea != null) {
				i++;
				suma += Double.parseDouble(linea);
				linea = bf.readLine();					
			}
			i--;
			
			bf.close();

			System.out.println("La media es " + suma/(double)i);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
