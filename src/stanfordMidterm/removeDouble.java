package stanfordMidterm;

public class removeDouble {
	public static void main(String[] args) {
		String test = removeDoubledLetters("CCAARROOLLIINNAA");
		System.out.println(test);
	}
	
	
	
	private static String removeDoubledLetters(String s) {
		String newString = "";
		
		char c = s.charAt(0);
		newString += c;
		for (int i = 1; i < s.length(); i++) {
			c = s.charAt(i);
			if(c != s.charAt(i-1)) {
				newString += c;
			}
		}
		return newString;
		
		
	}
}
