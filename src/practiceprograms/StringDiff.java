package src.practiceprograms;

public class StringDiff {

	public static void main(String[] args) {
//      (INTERVIEW - DHEERAJ)
//		Determine if the string contains "xyz". 
//		If it does, check if the number of characters before 
//		and after "xyz" differ by at most one and return TRUE if
//      they differ by at most 1 else return FALSE.
		
//    (NOTES)
//	  1. Here, differ by at most one means the difference between the 
//    length of the strings before and after "xyz" cannot be greater
//    than 1. Meaning, the difference can be <=1 (any value less than 1 or exactly 1).
//      
//    2. You can subtract the length of strings coming after(right) and before(left)
//    "xyz" from either side (either subtract the length of right hand side 
//    from left hand side or vice-versa). The only thing that matters is 
//    the difference between the length of strings before and after "xyz" can be <=1
//    only.
		 
		
//		Example:
//		// INPUT: "ABxyzBBC"
		// OUTPUT: True (because the length difference of AB and BBC is either 1 or -1
		// depending on from which side you subtract the length of the strings
		// coming after and before "xyz" from). 
//
//		// INPUT: "ABCAxyzBA"
		// OUTPUT: False (because the length difference of BA and ABCA is either 2 or -2
		// depending on from which side you subtract the length of the strings
		// coming after and before "xyz" from).
//
//		// INPUT": ABxyzBC" 
		// OUTPUT: True (because the length difference of AB and BBC is always 0
		// irrespective of which side you subtract the length of the strings
		// coming after and before "xyz" from).
//
//		// INPUT: "ABCAxyzB" 
		// OUTPUT: False (because the length difference of BA and ABCA is either 3 or -3
		// depending on from which side you subtract the length of the strings
		// coming after and before "xyz" from)

		String str = "ABCAxyzBA";

		if(str.contains("xyz")) {
			String rightStr = str.substring(str.indexOf("xyz", 2));
			String leftStr = str.substring(str.indexOf("xyz", 0));
			
			System.out.println("right str: "+ rightStr);

			if(rightStr.length()-leftStr.length() == 0 || rightStr.length()-leftStr.length() == 1) {
				System.out.println("true");
			}

			else {
				System.out.println("false");
			}
		}
	}

}
