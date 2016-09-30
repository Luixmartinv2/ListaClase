package clase_A;

import java.util.ArrayList;
import java.util.Scanner;

public class Clase_B {

	static String cadena;

	public ArrayList<String> crearArray() {

		ArrayList<String> personas = new ArrayList<String>();
		int Tamaño;
		String Nombre;

		Scanner entradaEscaner = new Scanner(System.in);
		Scanner entradaTamaño = new Scanner(System.in);
		System.out.println("Tamaño de la lista de alumnos");
		Tamaño = entradaTamaño.nextInt();

		for (int i = 0; i <= (Tamaño - 1); i++) {
			System.out.println("Escribe el nombre del alumno " + (i + 1));
			Nombre = entradaEscaner.nextLine();
			personas.add(Nombre);
		}
		return personas;
	}

	public void EscribirPanatalla(ArrayList<String> arr) {

		// Recorre el array y mostra por pantalla
		// Por ejemplo: un println por cada elemento del array
		for (int i = 0; i < arr.size(); i++) {
			System.out.println((i + 1) + ". " + arr.get(i) + "\n");
		}
	}

}


