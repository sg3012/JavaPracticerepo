package src.practiceprograms;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "The rains have started here swiftly";

		String str2 = "The rains have started here swiftly";

		String str3 = "The RAINS have started here swiftly";

		String str4 = "    The rains have started here swiftly      ";
		
		String str5 = "Hello_World_Test_Selenium";
		
		String str6= "Hello";
		
		String str7= "World";
		
		int a=100;
		
		int b=200;
		
		
        // length() METHOD:
		// Get the length of String
		System.out.println("Length of string:" + str1.length());
        
		// charAT() METHOD:
		// Find the character at a particular index
		System.out.println("Character at index '5':" + str1.charAt(5));

		// indexOf(int ch) METHOD:
		// Find the index of the 1st occurrence of a character
		System.out.println("Index of 1st 's':" + str1.indexOf('s')); // 1st occurrence of s

	    // indexOf(int ch , int fromIndex) METHOD
		// Find the index of a character apart from it's 1st occurrence
		System.out.println("Index of 2nd 's':" + 
		str1.indexOf('s', str1.indexOf('s') + 1)); // 2nd occurrence of s

		System.out.println("Index of 3rd 's':" 
		+ str1.indexOf('s', str1.indexOf('s', str1.indexOf('s') + 1) + 1)); // 3rd
																									// occurrence of s
																									
		// Find index of a character which is not present in the main string
		System.out.println("Index of 'j':" + str1.indexOf('j')); // indexOf() function will return
																	// -1 if any character
																	// is not there in the main string
		
		// indexOf(String str) METHOD:
		// Find the index of 1st occurrence of a substring, basis of the index of it's
		// first character
		// in the main string
		System.out.println("Index of 1st occurrence of 'have':" + str1.indexOf("have"));

		// Find index of a substring which is not present in the main string
		System.out.println("Index of 'hello':" + str1.indexOf("hello")); // indexOf() function 
		                                                                                          // will return
																			                      // -1 if any substring
																			                     // is not there in the main string
		
		// equals() METHOD:
		// Compare one string with other string (Case Sensitive)
		System.out.println("Str1 equal to Str2 ?:" + str1.equals(str2));
       
		// equalsIgnoreCase() METHOD:
		// Compare one string with other string (Case Insensitive)
		System.out.println("Str1 equal to Str3 ?:" + str1.equalsIgnoreCase(str3));

		// substring() METHOD:
		// Find a substring in the main string
		System.out.println("Substring:" + str1.substring(0, 9));

		// trim() METHOD:
		// Trimming the BEGINNING/LEADING/LEFT or
		// ENDING/TRAILING/RIGHT white spaces from a String
		System.out.println("String after leading and trailing spaces removed:" + str4.trim());

//		Note: The trim() method only removes the white spaces from the beginning or the end
//		of the string, not from the middle.

		// replace() METHOD:
		// Trimming the BEGINNING/LEADING/LEFT or
		// ENDING/TRAILING/RIGHT or MIDDLE white spaces from a String
		System.out.println("String after leading, trailing and middle spaces removed:" 
		+ str4.replace(" ", ""));
		
		// split() METHOD: 
		System.out.println("String after splitting it from underscrore:");
		
		String splitString[] = str5.split("_");
		
		for(int i = 0; i<splitString.length; i++) {
			
			System.out.println(splitString[i]);
		}
		
		// concat() METHOD:
		System.out.println("String 1 concatenated with String 5:"+str1.concat(str5));
		
		System.out.println("str6+str7+a+b: "+(str6+str7+a+b));
		
		System.out.println("a+b+str6+str7: "+(a+b+str6+str7));
		
		System.out.println("str6+str7+(a+b): "+(str6+str7+(a+b)));

	}

}
