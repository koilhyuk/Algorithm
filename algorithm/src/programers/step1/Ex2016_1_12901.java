package programers.step1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex2016_1_12901 {

	public static void main(String[] args) throws ParseException {
		int a = 5;
		int b = 24;
		String answer = "";
		String aTe = "";
		String bTe = "";
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		aTe = a < 10 ? "0" + a : a + "";
		bTe = b < 10 ? "0" + b : b + "";
		System.out.println("2016" + aTe + bTe);
		Date d = dateFormat.parse("2016" + aTe + bTe);

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);

		int day = cal.get(cal.DAY_OF_WEEK);

		switch (day) {
		case 1:
			answer = "SUN";
			break;

		case 2:
			answer = "MON";
			break;

		case 3:
			answer = "TUE";
			break;

		case 4:
			answer = "WED";
			break;

		case 5:
			answer = "THU";
			break;

		case 6:
			answer = "FRI";
			break;

		case 7:
			answer = "SAT";
			break;

		}

		System.err.println(answer);
	}

}