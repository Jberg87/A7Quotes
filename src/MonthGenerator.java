import java.util.Calendar;


public class MonthGenerator extends Generator {
	
	public String monthGenerator() {
		Calendar cal = Calendar.getInstance();
		int monthNum = cal.get(Calendar.MONTH);
		String month;
		if (monthNum == 0) {
			month = "January";
		} else if (monthNum == 1) {
			month = "February";
		} else if (monthNum == 2) {
			month = "March";
		} else if (monthNum == 3) {
			month = "April";
		} else if (monthNum == 4) {
			month = "May";
		} else if (monthNum == 5) {
			month = "June";
		} else if (monthNum == 6) {
			month = "July";
		} else if (monthNum == 7) {
			month = "August";
		} else if (monthNum == 8) {
			month = "September";
		} else if (monthNum == 9) {
			month = "October";
		} else if (monthNum == 10) {
			month = "November";
		} else {
			month = "December";
		}
		return month;
	}

}
