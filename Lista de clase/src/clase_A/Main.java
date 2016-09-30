package clase_A;

import java.util.ArrayList;



public class Main {
	public static void main(String[] args) {
		
		ArrayList<String> listaEscribe = new ArrayList();

		Clase_A claseA = new Clase_A();
		Clase_B claseB = new Clase_B();

		listaEscribe = claseB.crearArray();
		claseA.escribirFichero(listaEscribe);
		listaEscribe = claseA.leerFichero();
		claseB.EscribirPanatalla(listaEscribe);
	}

}
