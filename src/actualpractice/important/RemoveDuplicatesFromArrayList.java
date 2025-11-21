package src.actualpractice.important;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	// WAP in JAVA to remove all duplicate elements from an Array list of
	// Integers
	// For e.g. If a list is like {1, 2, 2, 3, 4, 4, 5}
	// then the resultant list should be {1, 2, 3, 4, 5}

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list = {1, 2, 2, 3, 4, 4, 5};

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5,6,7,6,5));

		System.out.println("The original list: " + list);

		Set<Integer> setOfEle = new LinkedHashSet<>();

		setOfEle.addAll(list);

		System.out.println("Set of original list: " + setOfEle);

		list.clear();

		list.addAll(setOfEle);

		System.out.println("List after duplicates removal: ");
		for(int e : list) {
			System.out.print(e);
			if(e!=list.get(list.size()-1)) {
				System.out.print(",");
			}
		}
	}

}
