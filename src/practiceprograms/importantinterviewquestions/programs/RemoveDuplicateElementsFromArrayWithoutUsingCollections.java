package src.practiceprograms.importantinterviewquestions.programs;

public class RemoveDuplicateElementsFromArrayWithoutUsingCollections {

	public static void main(String[] args) {
		int a[] = {1,1,2,1,2,3,4,5,5,6};
		int n = a.length;

		System.out.println("Original Array");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		
		// METHOD 1 - BRUTE FORCE | (TO BE TOLD IN INTERVIEW)
		if (n <= 1) {
			System.out.println("Array length cannot be less than or equal to 1");
		}

		else {
			int uniqueIndex = 0;
			for (int i = 0; i < n; i++) {
				// Check if an element is
				// marked as a duplicate or not
				// if not marked then only proceed with the if
				// condition. The element is marked duplicate
				// by replacing its repeated values with -1.
				// For e.g. if 1 is repeated multiple times
				// then mark one or more of it's
				// repeated occurrences (apart from the original one)
				// with -1
				if (a[i] != -1) {
					for (int j = i + 1; j < n; j++) {
						if (a[i] == a[j]) {
							a[j] = -1;
						}
					}

					// move the current element
					// to uniqueIndex only if
					// the current element is
					// not marked as -1.
					// It doesn't matter the element
					// comes out to be duplicate or not
					// even it is not marked as -1. If
					// it's not marked as -1 and it is
					// a duplicate then also it will be moved
					// to unique index or it's not marked
					// as -1 and it is not a duplicate then
					// also it will be moved to unique index.
					a[uniqueIndex++] = a[i];
				}

			}

			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}

			System.out.println();

			// Create a new result array with the
			// size equal to unique elements only in the
			// original array

			int result[] = new int[uniqueIndex];
			n = result.length;

			// Manually copying unique elements from the original
			// array to the new result[] array

			for (int i = 0; i < n; i++) {
				result[i] = a[i];
			}

			// Print the resultant array with unique elements

			System.out.println("Array after removing duplicates");

			for (int k = 0; k < n; k++) {
				System.out.print(result[k] + " ");
			}
		}
	}
}
