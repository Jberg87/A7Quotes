
public class Quote {
	String name, quote;
	
	public void printQOD() {
		char[] charsName = name.toLowerCase().toCharArray();
		  boolean found = false;
		  for (int i = 0; i < charsName.length; i++) {
		    if (!found) {
		      charsName[i] = Character.toUpperCase(charsName[i]);
		      found = true;
		    } else if (Character.isWhitespace(charsName[i])) {
		      found = false;
		    }
		  }
		String namePrint = String.valueOf(charsName);
		String quotePrint = Character.toUpperCase(quote.charAt(0)) + quote.substring(1);
	
		System.out.println("\"" + quotePrint + "\"  -- " + namePrint);
	}
}
