package classworks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindDuplicateUsingMap {

	public static void main(String[] args) {

		String cName = "ACCCENTURE";

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
