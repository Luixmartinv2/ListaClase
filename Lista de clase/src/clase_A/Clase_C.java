package clase_A;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.InputStream;

public class Clase_C {

	private Connection conexion;
	private Statement st;
	private ResultSet rs;

	Scanner scan = new Scanner(System.in);
	Properties propiedades = new Properties();
	InputStream entrada = null;

	public Clase_C() {

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			entrada = new FileInputStream("configuracion.properties");
			propiedades.load(entrada);
			conexion = DriverManager.getConnection(propiedades.getProperty("url") + propiedades.getProperty("bd"),
					propiedades.getProperty("login"), propiedades.getProperty("pwd"));
			System.out.println("Conectado con éxito.");
			entrada.close();
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}

	}

	public HashMap<Integer, String> Consulta() {
		HashMap<Integer, String> pelis = new HashMap<Integer, String>();
		try {
			String query = "SELECT * FROM lista_de_clase.lista_alumnos;";
			st = conexion.createStatement();
			rs = st.executeQuery(query);

			while (rs.next()) {

				pelis.put(rs.getInt("ID_Alumno"), rs.getString("lista_alumnos"));
			}

			rs.close();
			st.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}

		return pelis;
	}

	@SuppressWarnings("null")
	public void insertarDatos(ArrayList<String> listaAlumnos) {

		HashMap<Integer, String> pelis = null;

		Integer ID_Alumno;

		String lista_alumnos;

		for (HashMap.Entry<Integer, String> entry : pelis.entrySet()) {
			for (int i = 0; i < listaAlumnos.size(); i++) {
			ID_Alumno=(i+1);
			lista_alumnos=listaAlumnos.get(i);
			ID_Alumno = entry.getKey();
			lista_alumnos = entry.getValue();

			String query = "INSERT INTO peliculas (ID_Alumno,lista_alumnos) VALUES ('" + ID_Alumno + "', '"
					+ lista_alumnos + "');";
			
			try {
				PreparedStatement ps = conexion.prepareStatement(query);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}

		}

	}

}