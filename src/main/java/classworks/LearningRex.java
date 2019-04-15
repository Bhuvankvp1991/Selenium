package classworks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearningRex {

	public static void main(String[] args) {

		/*String txt = "xaXXbxcX";
		String patt = "[a-z][x][X]";
		String patt1="[[a-c][x]";
		Pattern p = Pattern.compile(patt);
		//Pattern p1 = Pattern.compile(patt1);

		Matcher m = p.matcher(txt);
		//Matcher m2 = p1.matcher(txt);

		while(m.find())
		{
			System.out.print(m.group());
          //  System.out.print(m2.group());  		
		}*/
		
		String txt2= "xyz95@gmail.com";
		String patt2= "[a-z]{3}[0-9]{2}@[a-z]{5}.[a-z]{3}";
		Pattern p2=Pattern.compile(patt2);
		Matcher m3=p2.matcher(txt2);
		while(m3.find())
		{
		System.out.println(m3.group());
		}
		
	}

}
