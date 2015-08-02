/*
 *
 * FICHEROS
 * 
 * 5. Escribe un programa capaz de quitar los comentarios de un programa de Java. Se utilizaría de
 *    la siguiente manera:
 *           quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 *    Por ejemplo:
 *           quita_comentarios hola.java holav2.java
 *    crea un fchero con nombre holav2.java que contiene el código de hola.java pero sin los comentarios.
 *
 * @author Luis José Sánchez
 *
 */

import java.io.*;

class FichEjercicio05 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Uso del programa: FichEjercicio05 PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
			System.exit(-1);
		}
				
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

			String lineaOrigen = "", lineaDestino = "";
			boolean comentarioDeBloque = false;
			int i = 0;
			
			while ((lineaOrigen = br.readLine()) != null) {
				
				int l = lineaOrigen.length();
				lineaDestino = lineaOrigen;

				// Detecta inicio de comentario de bloque 
				if ((i = lineaOrigen.indexOf("/*")) != -1) {
					comentarioDeBloque = true;
					lineaDestino = lineaOrigen.substring(0, i);
					lineaOrigen = lineaDestino;
				}
				
				// Detecta fin de comentario de bloque 
				if ((i = lineaOrigen.indexOf("*/")) != -1) {
					comentarioDeBloque = false;
					lineaDestino = lineaOrigen.substring(i + 2, l);
				}
				// Detecta comentario de línea
				if (((i = lineaOrigen.indexOf("//")) != -1) && !comentarioDeBloque)
					lineaDestino = lineaOrigen.substring(0, i);

				if (!comentarioDeBloque)
					bw.write(lineaDestino + "\n");
			}
			
			br.close();
			bw.close();

		} catch (IOException ioe) {	System.err.println(ioe.getMessage()); }
	}
}
