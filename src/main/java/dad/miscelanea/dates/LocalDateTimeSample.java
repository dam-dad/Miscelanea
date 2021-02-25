package dad.miscelanea.dates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTimeSample {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()));
	}
	
}
