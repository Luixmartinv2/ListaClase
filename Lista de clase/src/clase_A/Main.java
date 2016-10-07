package clase_A;

import java.util.*;

public class Main {
	static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);

		ArrayList<String> listaEscribe = new ArrayList();

		Clase_B claseB = new Clase_B();
		Clase_A claseA = new Clase_A();
		Clase_C claseC = new Clase_C();

		int op = 0; // Opcion
		boolean salir = false;

		while (!salir) { // Estructura que repite el algoritmo del menu
							// principal hasta que se la condicion sea falsa
			// Se muestra el menu principal
			System.out.println("****************************************** \n" + "-  0 Salir \n"
					+ "-  1 Crear array  \n" + "-  2 Registrar array en fichero txt \n"
					+ "-  3 Extraer lista txt y mostrarla por pantalla \n" + "-  4 Registrar array en BBDD \n"
					+ "-  5 Estraer lista BBDD y mostrarla por pantalla \n" + "-  6 Mostrar array \n"
					+ "******************************************");

			op = teclado.nextInt(); // Se le da a la variable op el valor del
									// teclado
			System.out.println("OPCION SELECCIONADA:" + op);
			switch (op) {
			case 0:// Salir
				salir = true;
				System.out.println("Hasta luego");
				break;
			case 1:// Crear lista
				listaEscribe = claseB.crearArray();
				break;
			case 2:// Registrar lista en txt
				claseA.escribirFichero(listaEscribe);
				break;
			case 3:// Extraer lista txt
				listaEscribe = claseA.leerFichero();
				claseB.EscribirPanatalla(listaEscribe);
				break;
			case 4:// Registrar lista en BBDD
				claseC.insertarDatos(listaEscribe);
				// listaEscribe = claseC.
				break;
			case 5:// Extraer lista de BBDD
				claseC.Consulta();
				// claseC.
				break;
			case 6:// Mostrar lista
				claseB.EscribirPanatalla(listaEscribe);
				break;
			default:// No valido
				System.out.println("Opcion invalida: marque un numero de 0 a 6");
				break;

			// listaEscribe = claseB.crearArray();
			// claseA.escribirFichero(listaEscribe);
			// listaEscribe = claseA.leerFichero();
			// claseB.EscribirPanatalla(listaEscribe);
			// listaEscribe = claseC.
			// claseC.
			}

		}
	}
}
