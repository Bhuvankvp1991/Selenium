package classworks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class RexHW {

	public static void main(String[] args) {

		String cName = "No of employee in infosys india is 124012 and no of employee in north america is 4040";

		Map<Character, Integer> data = new LinkedHashMap<Character,Integer>();

		char[] eachChar = cName.toCharArray();

		for (char ch : eachChar) {
			if(data.containsKey(ch))
			{
				//System.out.println("The Character " +ch+ "is duplicate");
				data.put(ch,data.get(ch)+1);	
			}
			else{
				data.put(ch,1);

			}
		}
		System.out.println(data);

	}

}
