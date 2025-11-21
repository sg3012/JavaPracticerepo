package src.actualpractice.important;

public class RemoveDuplicateElementsFromArrayWithoutUsingCollections {
	// WAP to remove duplicates from an integer array witout using collections
	// For e.g. : If array is like {1, 2, 2, 3, 4, 4, 5}
	// then the resultant array should be {1, 2, 3, 4, 5}

	public static void main(String[] args) {
		int arr[] = { 1, 10, 20, 10, 20, 3, 4, 5, 5, 6,5};
		int n = arr.length;

		System.out.println("Original array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
			if (i != n - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		int uniqueIndex = 0;
		if (n <= 1) {
			System.out.println("Array length cannot be less than or equal to 1");
		} else {
			for (int i = 0; i < n; i++) {
				if (arr[i] != -1) {
					for (int j = i + 1; j < n; j++) {
						if (arr[i] == arr[j]) {
							arr[j] = -1;
						}
					}
					arr[uniqueIndex++] = arr[i];
				}
			}
		}

		int result[] = new int[uniqueIndex];
		for (int i = 0; i < result.length; i++) {
			result[i] = arr[i];
		}

		System.out.println("Array after removing duplicates: ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			if (i != result.length - 1) {
				System.out.print(" ");
			}
		}
	}

}
