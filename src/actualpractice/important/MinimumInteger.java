package src.actualpractice.important;

//WAP in JAVA to find minimum integer from an
//array of integers
public class MinimumInteger {

	public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3, 20, 2};
		int min = arr[0];
		for(int i =0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum element is: "+min);
	}

}
