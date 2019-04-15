package learningstring;

public class OccurenceOfChar {

	public static void main(String[] args) {

		String txt = "Success";
		char[] charArray = txt.toCharArray();
		int k=0;
		for(char c : charArray) {

			if(c == 'c')
			{
				k++;
			}
		}
		System.out.println("the occurence is " +k);
	}

}
