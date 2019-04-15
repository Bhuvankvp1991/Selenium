package learningstring;

public class LearningStringBuffer {

	public static void main(String[] args) {
		String txt1 = "Successb";
		String txt2 = "failurec";

		StringBuffer buffer = new StringBuffer(txt1);
		buffer = new StringBuffer(txt2);
		
		int compareText= txt1.compareToIgnoreCase(txt2);
		//compareText
		//System.out.println(compareText);
		
	}

}
