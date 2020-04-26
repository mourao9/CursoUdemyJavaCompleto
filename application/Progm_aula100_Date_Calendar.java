package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Progm_aula100_Date_Calendar {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date d = Date.from(Instant.parse("2020-04-01T09:17:00Z"));

		System.out.println("Dia da compra: " + sdf.format(d));
		System.out.println("-----------------------------");

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int H = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int seg = cal.get(Calendar.SECOND);

		cal.add(Calendar.DAY_OF_MONTH, 30);
		d = cal.getTime();

		System.out.println("Vencimento: " + sdf.format(d));
		System.out.println("Horário: "+"0" + H + ":" + min + ":0" + seg);
	}

}
