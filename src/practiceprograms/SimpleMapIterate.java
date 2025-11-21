package src.practiceprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SimpleMapIterate {

	public static void main(String[] args) {

		Map<String,Integer> marks = new HashMap<>();
		marks.put("Jitesh", 65);
		marks.put("Karan", 90);
		marks.put("Sagar", 98);

		Set<Entry<String,Integer>> marksEntry =  marks.entrySet();

		for(Entry<String,Integer> e : marksEntry) {
			System.out.print(e.getKey()+": "+e.getValue());
			System.out.println();

		}
	}

}
