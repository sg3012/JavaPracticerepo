package src.practiceprograms;

import java.util.*;

public class SortHashMapByKeys {

	private static Scanner scan = new Scanner(System.in);

	public static TreeMap<Integer, String> sortMapByKey(Map<Integer, String> linkedHashMap) {

		return new TreeMap<Integer, String>(linkedHashMap);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		// Take size of the HashMap through user input
		System.out.println("Enter the size of the HashMap:");

		size = scan.nextInt();

		// Enter elements in HashMap through user input
		System.out.println("Enter the elements in HashMap:");

		Map<Integer, String> sampleMap = new LinkedHashMap<Integer, String>();

		for (int i = 1; i <= size; i++) {

			sampleMap.put(scan.nextInt(), scan.nextLine());
		}

		System.out.println("Unsorted elements in the HashMap are:");

		for (var entry : sampleMap.entrySet()) {

			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Method 1 : Using TreeMap structure.
		// Create an object of TreeMap
		// Initialise the object of Treemap by the HashMap above
		// Print the elements of TreeMap

		Map<Integer, String> sortedMap = sortMapByKey(sampleMap);

		System.out.println("Sorted elements in the HashMap are:");

		for (var entry : sortedMap.entrySet()) {

			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		scan.close();

	}

}
