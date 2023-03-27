package src.practiceprograms;

import java.util.*;

// WAP in JAVA to remove all duplicate elements from an Array list of
// Integers

public class RemoveDuplicatesFromArrayList {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arrayList) {
		
		// Using LinkedHashSet in this problem as it only allows unique elements and remove
		// all duplicate occurrences
		Set<Integer> set = new LinkedHashSet<Integer>();
		
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
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		System.out.println("Enter list elements:");
		
		for(int i = 0; i<arrayListSize; i++) {
			myList.add(scan.nextInt());
		}
		
		scan.close();
		
		System.out.println("List after removing duplicates:");
		
		myList = removeDuplicates(myList);
		
		for(int i = 0; i<myList.size(); i++) {
		System.out.println(myList.get(i));
		}

	}

}
