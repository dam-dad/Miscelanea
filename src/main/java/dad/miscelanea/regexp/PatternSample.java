package dad.miscelanea.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSample {
	
	public static void main(String[] args) {
		
		String cadena = "https://swapi.co/api/people/4556/?format=json";
		
		Pattern patron = Pattern.compile("https://swapi.co/api/people/([0-9]+).*"); // \d = [0-9] 

		Matcher resultados = patron.matcher(cadena);
		
		if (resultados.find()) {
			System.out.println(Integer.parseInt(resultados.group(1)));
		} else {
			System.out.println("no encontré nada");
		}
		

	}

}
