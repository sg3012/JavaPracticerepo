//Problem : Write a program to print all the LEADERS in the array. An element is a leader if it is greater than 
//all the elements to its right side. And the rightmost element is always a leader. 
//For example in the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

package src.practiceprograms;

import java.util.Scanner;

public class LeaderElements {

	int size, temp, count = 0;
	// Count variable is to keep track of number of leader elements in the arrays.

	boolean flag = false;

	public void findleaders(int length) {
		this.size = length;

		Scanner sc1 = new Scanner(System.in);

		int array[] = new int[this.size];

		System.out.println("Enter the elements of array: ");

		for (int i = 0; i < array.length; i++) {

			array[i] = sc1.nextInt();
		}

		sc1.close();

		// Temp variable is used to store the rightmost element and print it
		// as it will always be the Leader.
		temp = array[(array.length) - 1];

		System.out.println("Leader elements: ");

		for (int j = 0; j < (array.length) - 1; j++) {

			// System.out.println("j: "+j);

			for (int k = j + 1; k <= (array.length) - 1;) {

				// System.out.println("k: "+k);

				if (array[k] < array[j]) {

					flag = true;

					k = k + 1;

				} else {

					flag = false;

					break;
				}
			}
			if (flag == true) {

				array[count] = array[j];

				System.out.println(array[count]);

				count = count + 1;
			} else if (flag == false) {

				flag = false;
			}
		}
		System.out.println(temp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s;

		System.out.println("Enter the size of array: ");

		Scanner sc = new Scanner(System.in);

		s = sc.nextInt();

		LeaderElements L = new LeaderElements();

		L.findleaders(s);

		sc.close();

	}

}
