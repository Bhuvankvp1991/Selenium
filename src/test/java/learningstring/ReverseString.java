package learningstring;

public class ReverseString {

	public static void main(String[] args) {

		String txt = "Success";
		int length = txt.length();
		char[] charArray = txt.toCharArray();
		for (int i = length - 1; i >=0; i--) {
		char charAt = txt.charAt(i);
		System.out.print (charAt);
		}
	}

}
