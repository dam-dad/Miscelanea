package dad.javafx.miscelanea.ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	
	public static void leerLineaALinea(File fichero) throws IOException {
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}

	public static void main(String[] args) throws IOException {
		leerLineaALinea(new File("datos.csv"));
	}

}
