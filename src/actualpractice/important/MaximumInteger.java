package src.actualpractice.important;

//WAP in JAVA to find maximum integer from an
//array of integers
public class MaximumInteger {

	public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3, 20, 2};
		
		// METHOD 1(BEGINNER): Assigning an array element
		// to max and keep updating max if current
		// element is greater than until we find the maximum
		// element in the array
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element is: "+max);
	}

}
