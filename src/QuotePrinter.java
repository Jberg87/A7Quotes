import java.util.ArrayList;
import java.util.Calendar;

public class QuotePrinter {

	public static void main(String[] args) {
			
		String weekDay, month;
		int monthDayNum;
		ArrayList<Quote> quotes = quoteMakeList();
		// Define day, dayNum, month
		DayGenerator dg = new DayGenerator();
		weekDay = dg.nameToday();
		
		Calendar cal = Calendar.getInstance();
		monthDayNum = cal.get(Calendar.DAY_OF_MONTH);
		MonthGenerator mg = new MonthGenerator();
		month = mg.monthGenerator();
		
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR) - 1;
		int quoteDay = dayOfYear %= 7;
		Quote quoteOfDay = quotes.get(quoteDay);

		// Print result
		System.out.println("Quote for " + weekDay + " the " + monthDayNum + "th of " + month + ":");
		System.out.println();
		quoteOfDay.printQOD();		
	}

	private static ArrayList<Quote> quoteMakeList() {
		// Create quotes
		Quote galileo = new Quote();
		galileo.name = "galileo";
		galileo.quote = "eppur si muove";

		Quote achimedes = new Quote();
		achimedes.name = "achimedes";
		achimedes.quote = "eureka!";

		Quote erasmus = new Quote();
		erasmus.name = "erasmus";
		erasmus.quote = "in regione caecorum rex est luscus";

		Quote socrates = new Quote();
		socrates.name = "socrates";
		socrates.quote = "I know nothing except the fact of my ignorance";

		Quote descartes = new Quote();
		descartes.name = "rené descartes";
		descartes.quote = "cogito, ergo sum";

		Quote newton = new Quote();
		newton.name = "sir isaac newton";
		newton.quote = "if I have seen further it is by standing on the shoulders of giants";

		// Put quotes in quote list
		ArrayList<Quote> quotes = new ArrayList<Quote>();
		quotes.add(galileo);
		quotes.add(achimedes);
		quotes.add(erasmus);
		quotes.add(socrates);
		quotes.add(descartes);
		quotes.add(newton);
		return quotes;

	}
}

