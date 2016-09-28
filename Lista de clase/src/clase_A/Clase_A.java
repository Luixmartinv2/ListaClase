package clase_A;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Clase_A {
	public String p = "p";
	public ArrayList<String> listaAlumnos = new ArrayList<String>();

	// este metodo es para incluir el Arraylist en el documento de texto.
	public void escribirFichero() {

		String sFichero = "lista.txt";
		File fichero = new File(sFichero);

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(sFichero));
		} catch (IOException e) {

			e.printStackTrace();
		}

		for (int x = 0; x < listaAlumnos.size(); x++) {

			try {
				bw.write(x + "." + listaAlumnos.get(x) + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	};

	public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
		String cadena;
		FileReader f = new FileReader(archivo);
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {
			System.out.println(cadena);
		}
		b.close();
	}
	
	 /*public static void main(String[] args) throws IOException {
	        muestraContenido("lista.txt");
	    }*/

}
