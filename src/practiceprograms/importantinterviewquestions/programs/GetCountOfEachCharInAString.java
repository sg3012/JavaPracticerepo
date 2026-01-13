package src.practiceprograms.importantinterviewquestions.programs;

import java.util.HashMap;
import java.util.Map;

public class GetCountOfEachCharInAString {
	
	// Given a string we have to find the
	// count of each character in that string
	// including repeating ones.

	public static void main(String[] args) {
		
		String str = "Automation";
		str = str.toLowerCase();

		Integer count = null;
        Map<Character, Integer> mapOfSampleString = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            count = mapOfSampleString.get(str.charAt(i)); 
            if (count == null) {
                mapOfSampleString.put(str.charAt(i), 1);
            }
            else {

                count += 1;
                mapOfSampleString.put(str.charAt(i), count);
            }
        }
        
        System.out.println("Each character occurrence:" + mapOfSampleString);

	}

}
