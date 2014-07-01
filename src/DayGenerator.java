import java.util.Calendar;

public class DayGenerator extends Generator {

	public String nameToday() {
		Calendar cal = Calendar.getInstance();

		int todayDay = cal.get(Calendar.DAY_OF_WEEK);
		String weekDay;
		if (todayDay == 0) {
			weekDay = "Monday";
		} else if (todayDay == 1) {
			weekDay = "Tuesday";
		} else if (todayDay == 2) {
			weekDay = "Wednesday";
		} else if (todayDay == 3) {
			weekDay = "Thursday";
		} else if (todayDay == 4) {
			weekDay = "Friday";
		} else if (todayDay == 5) {
			weekDay = "Saturday";
		} else {
			weekDay = "Sunday";
		}
		return weekDay;
	}
}
