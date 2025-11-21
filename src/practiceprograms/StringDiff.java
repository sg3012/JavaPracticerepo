package src.practiceprograms;

public class StringDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Determine if the string contains "xyz". If it does, check if the number of characters before and after "xyz" differ by at most one.
//
//		Example:
//
//
//
//		"ABxyzBBC": True
//
//		"ABCAxyzBA": False (
//
//		"ABxyzBC": True
//
//		"ABCAxyzB": False

		String str = "ABCAxyzBA";

		if(str.contains("xyz")) {
			String rightStr = str.substring(str.indexOf("xyz", 2));
			String leftStr = str.substring(str.indexOf("xyz", 0));

			if(rightStr.length()-leftStr.length() == 0 || rightStr.length()-leftStr.length() == 1) {
				System.out.println("true");
			}

			else {
				System.out.println("false");
			}
		}
	}

}
