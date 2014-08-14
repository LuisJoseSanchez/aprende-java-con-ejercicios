/*
 *
 * Ejemplo de uso de la clase File
 * Lectura de un fichero de texto
 *
 */

import java.io.*;

class EjemploFichero01 {

	public static void main(String[] args) {
		
		try {	
			BufferedReader bf = new BufferedReader(new FileReader("malaga1.txt"));
			
			String linea = "";
			
			while (linea != null) {
				System.out.println(linea);
				linea = bf.readLine();
			} 
		
			bf.close();
			
		} catch (FileNotFoundException e) { // qué hacer si no se encuentra el fichero
			System.out.println("No se encuentra el fichero malaga.txt");
		} catch (IOException e) { // qué hacer si hay un error en la lectura del fichero
			System.out.println("No se puede leer el fichero malaga.txt");
		}
	}
}
