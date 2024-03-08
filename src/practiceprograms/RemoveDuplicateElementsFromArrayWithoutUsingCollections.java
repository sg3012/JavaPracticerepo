package src.practiceprograms;

public class RemoveDuplicateElementsFromArrayWithoutUsingCollections {

	public static void main(String[] args) {
		int a[] = {1,1,2,1,2,3,4,5,5,6};
		int n = a.length;
		
		System.out.println("Original Array");

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();

		if (n <= 1) {
			System.out.println("Array length cannot be less than or equal to 1");
		}

		else {
			int uniqueIndex = 0;
			for (int i = 0; i < n; i++) {
				// Check if an element is
				// marked as a duplicate or not
				// if marked then only proceed with the if
				// condition
				if (a[i] != -1) {
					for (int j = i + 1; j < n; j++) {
						if (a[i] == a[j]) {
							a[j] = -1;
						}
					}

					// if the current element in the
					// original array is not already moved to
					// an index which may be unique,
					// then move that element to the unique index
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
