package dad.javafx.miscelanea.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class LeerFichero {
	
	public static List<String> leerLineaALinea(File fichero, Charset charset) throws IOException {
		List<String> lines = new ArrayList<String>();
		FileReader fr = new FileReader(fichero, charset);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
		return lines;
	}
	
	public static void main(String[] args) throws IOException {
		
		// usando implementación propia
		List<String> lines1 = leerLineaALinea(new File("datos.csv"), Charset.forName("UTF-8"));
		lines1.stream().forEach(l -> System.out.println(l));
		
		// usando librería commons-io
		List<String> lines2 = FileUtils.readLines(new File("datos.csv"), Charset.forName("UTF-8"));
		lines2.stream().forEach(l -> System.out.println(l));
		
	}

}
