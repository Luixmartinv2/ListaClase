package clase_A;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Clase_A {
	public String p = "p";
	public ArrayList<String> listaAlumnos = new ArrayList<String>();
	
		//este metodo es para incluir el Arraylist en el documento de texto.
		public void escribirFichero( ){
			
			String sFichero = "lista.txt";
			File fichero = new File(sFichero);
			
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(sFichero));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			for (int x=0;x<10;x++){
				
				try {
					bw.write(x +"." + listaAlumnos.get(x) + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
				   
			
		};
		
		/*public x leerFichero(){
			
		}*/
	}


