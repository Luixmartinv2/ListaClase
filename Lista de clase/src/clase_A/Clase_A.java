package clase_A;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Clase_A {
	public String p = "p";
	// private ArrayList<String> personas = new ArrayList<String>();

	// este metodo es para incluir el Arraylist en el documento de texto.
	public static void escribirFichero(ArrayList<String> listaAlumnos) {

		String sFichero = "lista.txt";

		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("Lista2.txt");

			for (int x = 0; x <= listaAlumnos.size() - 1; x++) {

				pw = new PrintWriter(fichero);
				pw.println(listaAlumnos.get(x));
			}
			fichero.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> leerFichero() {
		ArrayList<String> personas = new ArrayList<String>();
		File archivo = null;

		// Recorre el fichero y añadir elementos a mi arraylist

		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File("Lista2.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String Linea;
			while ((Linea = br.readLine()) != null) {
				personas.add(Linea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return personas;
	}

}
