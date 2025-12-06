package src.practiceprograms.importantinterviewquestions;

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
		 
		
//		Examples:
//		// INPUT: "ABxyzBBC"
		// OUTPUT: True, if you subtract the length of substring from the right of "xyz"
		// to the left of it. Because the length difference comes to be 1 which is equal to 1.
		// True, if you subtract the difference of the length of substring from the left of "xyz"
		// to the right of it. Because the length difference comes to be -1 which is less than 1. 
//
//		// INPUT: "ABCAxyzBA"
		// OUTPUT: True, if you subtract the length of substring from the right of "xyz"
		// to the left of it. Because the length difference comes to be -2.  
		// False, if you subtract the difference of the length of substring from the left of "xyz"
		// to the right of it. Because the length difference comes to be 2.
//
//		// INPUT": ABxyzBC" 
		// OUTPUT: True, if you subtract the length of substring either from the right of "xyz"
		// to the left of it or vice-versa. Because the length difference comes to be 0 which is less than 1
		// irrespective of we subtract the right subString from left or vice-versa. 
//
//		// INPUT: "ABCAxyzB" 
		// OUTPUT: False, if you subtract the length of substring from the right of "xyz"
		// to the left of it. Because the length difference comes to be 2.
		// True, if you subtract the length of substring from the left of "xyz"
		// to the right of it. Because the length difference comes to be -2. 
		
		// BELOW LOGIC IS IMPLEMENTED BY SUBTRACTING LEFT SUBSTRING FROM RIGHT SUBSTRING
		// AND RESULTS WILL BE SAME AS HIGHLIGHTED IN ABOVE EXAMPLES

		String str = "ABCAxyzBA";

		if(str.contains("xyz")) {
			String leftRightArr[] = str.split("xyz");
			String leftSubStr = leftRightArr[0];
			String rightSubStr = leftRightArr[1];
			System.out.println("right str: "+ leftSubStr);
			System.out.println("left str: "+ rightSubStr);
			
			if(rightSubStr.length()-leftSubStr.length()<= 1) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
	}

}
