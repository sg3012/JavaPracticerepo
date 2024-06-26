package src.practiceprograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

// WAP in JAVA to remove all duplicate elements from an Array list of
// Integers

public class RemoveDuplicatesFromArrayList {

	private static Scanner scan = new Scanner(System.in);

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arrayList) {

		// Using LinkedHashSet in this problem as it only allows unique elements and remove
		// all duplicate occurrences
		Set<Integer> set = new LinkedHashSet<>();

		// addAll() method allows one collection to be inserted / appended to the other collection
		set.addAll(arrayList);

		// clear() method removes all elements from a collection
		arrayList.clear();

		arrayList.addAll(set);

		return arrayList;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrayListSize;

		System.out.println("Enter number of elements in the list: ");

		arrayListSize = scan.nextInt();

		ArrayList<Integer> myList = new ArrayList<>();

		System.out.println("Enter list elements:");

		for(int i = 0; i<arrayListSize; i++) {
			myList.add(scan.nextInt());
		}

		scan.close();

		System.out.println("List after removing duplicates:");

		myList = removeDuplicates(myList);

		for (Integer element : myList) {
		System.out.println(element);
		}

	}

}
