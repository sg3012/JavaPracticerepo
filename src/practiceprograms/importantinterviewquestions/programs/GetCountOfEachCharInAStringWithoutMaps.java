package src.practiceprograms.importantinterviewquestions.programs;

public class GetCountOfEachCharInAStringWithoutMaps {

	// Given a string - we have to find the count/
	// occurrence of each character in the string using JAVA
	// without using MAPS.
	// For e.g. you have a string "My name is Shubham Gupta"
	// The output should display count
	// of each character in like below:
	// m - 3
	// y - 1
	// n - 1
	// a - 3
	// e - 1
	// i - 1
	// s - 2
	// h - 2
	// u - 2
	// b - 1
	// g - 1
	// p - 1
	// t - 1

	public static void main(String[] args) {
		String str = "My name is Shubham Gupta";
		
		// [INTERMEDIATE] | USING CHARACTER ARRAY, SIMPLE LOOPS AND STRINGS OPERATIONS
		// | EASY TO UNDERSTAND | TO BE TOLD IN INTERVIEW
		str = str.toLowerCase().trim();
		String str2 = "";
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			int consecutiveCount = 1;
			for (int j = i; j < ch.length; j++) {
				if (j != i && ch[j] != 1 && ch[j] != ' ' && str.charAt(i) == ch[j]) {
					consecutiveCount++;
					ch[j] = 1;
				}
			}
			if (str.charAt(i) != ' ' && str2.indexOf(str.charAt(i)) == -1) {
				System.out.print(str.charAt(i) + " ");
				System.out.println(consecutiveCount);
			}
			str2 = str2+str.charAt(i);
		}

	}

}
