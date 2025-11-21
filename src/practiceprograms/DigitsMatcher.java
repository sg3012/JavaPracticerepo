package src.practiceprograms;

public class DigitsMatcher {

	// This class extracts a sequence(s) of
	// multiple numbers from a string and convert
	// those String formatted numbers into only Integers

	public static void main(String[] args) {
		String monthYear = "February 2026";

		String year = monthYear.replaceAll("\\D+", " ");

		System.out.println("----String having spaces-------");
		System.out.println(year);

		System.out.println("----- String with minimum spaces ------");
		year = year.trim();
		System.out.println(year);

		System.out.println("-------Number formatted years with spaces-------");
		int numYear;
		String strYearArr[] = year.split(" ");
		for(String str : strYearArr) {
			numYear = Integer.parseInt(str);
			System.out.print(numYear+" ");
		}
	}

}
