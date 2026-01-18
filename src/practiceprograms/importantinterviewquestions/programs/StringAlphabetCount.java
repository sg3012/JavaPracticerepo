package src.practiceprograms.importantinterviewquestions.programs;
import java.util.*;

public class StringAlphabetCount {

	// There is a string we have to print true if that 
	// string contains each and every character of the English alphabet. 
	// For e.g. if the string is "abcdefgh" then we have to print false
	// because they don't each alphabet of English otherwise true.
	
	public static void main(String[] args) {
		
		// Method 1 - BRUTE FORCE | Using Loops, Maps combination (TO BE TOLD IN INTERVIEW)
		String str = "Jackdaws love my big sphinx of quartz";
		
		str = str.replace(" ",""); // removing all leading, trailing and
		// middle spaces so that we are only left with letters or alphabets
		// for comparison in loop.
		str = str.replaceAll("[^a-zA-Z]","");// removing all non-alphabets 
		// so that we are only left with alphabets
		// for comparison in loop.
		
		Integer count = null;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			Character mapKey = Character.toLowerCase(ch);
			count = map.get(mapKey); // We are initializing count here
			// because when control goes to else block
			// it will pick up the value when count
			// was first initialized before the loop
			
			if(count == null) {
				map.put(mapKey, 1);
			}
			else {
				map.put(mapKey,count+1);
			}
		}
		System.out.println("Number of alphabets in string are: "+map.size());
		if(map.size() == 26) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
