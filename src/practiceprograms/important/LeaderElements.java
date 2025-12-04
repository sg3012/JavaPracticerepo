//Problem : Write a program to print all the LEADERS in the array. An element is a leader if it is greater than
//all the elements to its right side. And the rightmost element is always a leader.
//For example in the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

package src.practiceprograms.important;

import java.util.*;

public class LeaderElements {

//	int size, temp, count = 0;
//	// Count variable is to keep track of number of leader elements in the arrays.
//
//	boolean flag = false;
//	// Method 1 - Brute force but not easy to understand
//	public void findLeaders(int length) {
//		this.size = length;
//		Scanner sc1 = new Scanner(System.in);
//		int array[] = new int[this.size];
//		System.out.println("Enter the elements of array: ");
//		for (int i = 0; i < array.length; i++) {
//			array[i] = sc1.nextInt();
//		}
//		sc1.close();
//
//		// Temp variable is used to store the rightmost element and print it
//		// as it will always be the Leader.
//		temp = array[(array.length) - 1];
//		System.out.println("Leader elements: ");
//		for (int j = 0; j < (array.length) - 1; j++) {
//			// System.out.println("j: "+j);
//			for (int k = j + 1; k <= (array.length) - 1;) {
//				// System.out.println("k: "+k);
//				if (array[k] < array[j]) {
//					flag = true;
//					k = k + 1;
//				} else {
//					flag = false;
//					break;
//				}
//			}
//			if (flag) {
//				array[count] = array[j];
//				System.out.println(array[count]);
//				count = count + 1;
//			} else if (!flag) {
//				flag = false;
//			}
//		}
//		System.out.println(temp);
//	}

	// METHOD 2(INTERMEDIATE): Brute force,EASY TO UNDERSTAND
//	public void findLeaders(int arr[]) {
//		if (arr == null || arr.length == 0) {
//			System.out.println("No leaders present because array is empty");
//		} 
//		else {
//			for (int i = 0; i < arr.length; i++) {
//				boolean isLeader = true;
//				for (int j = i + 1; j < arr.length; j++) {
//					if (arr[j] >= arr[i]) {
//						isLeader = false;
//						break;
//					}
//				}
//				if (isLeader) {
//					System.out.print(arr[i] + " ");
//				}
//			}
//		}
//	}

	// METHOD 3(INTERMEDIATE): Starting array iteration from right, using array
	// list, | COMPLEXITY - O(n),EASY TO UNDERSTAND
		public List<Integer> findLeaders(int arr[]) {
			ArrayList<Integer> leaders = new ArrayList<Integer>();
			if (arr == null || arr.length == 0) {
				System.out.println("No leaders present because array is empty");
				return leaders;
			} 
			leaders.add(arr[arr.length - 1]);
			int maxFromRight = arr[arr.length - 1];

			for (int i = arr.length - 2; i >= 0; i--) {
				if (arr[i] > maxFromRight) {
						leaders.add(arr[i]);
						maxFromRight = arr[i];
				}
			}
			Collections.reverse(leaders);
			return leaders;
		}
		
	//METHOD 4(EXPERT): Using ArrayDeque and Loops, | COMPLEXITY - O(n),
	// EASY TO UNDERSTAND
	// ADVANTAGES OF DEQUE:
	// Directly adds the leader elements from the beginning of 
	// the queue in the same sequence as they were in the original array(left->right).
	// Therefore reducing one operation of calling reverse method on the collection
	// as mentioned in the Method 3.
		
	public Deque<Integer> getLeaders(int arr[]) {
		Deque<Integer> leaders = new ArrayDeque<Integer>();
		if(arr == null | arr.length == 0) {
			System.out.println("No leaders because array is empty");
			return leaders;
		}
		leaders.addFirst(arr[arr.length-1]);
		int maxFromRight = arr[arr.length-1];
		for(int i = arr.length-2; i>=0; i--) {
			if(arr[i] > maxFromRight) {
				leaders.addFirst(arr[i]);
				maxFromRight = arr[i];
			}
		}
		return leaders;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int s;
//		System.out.println("Enter the size of array: ");
//		Scanner sc = new Scanner(System.in);
//		s = sc.nextInt();
//		LeaderElements l = new LeaderElements();
//		l.findLeaders(s);
//		sc.close();

		LeaderElements l = new LeaderElements();
		int array[] = {16, 17, 4, 3, 5, 2};
		List<Integer> listofLeaders = new ArrayList<Integer>();
//		listofLeaders = l.findLeaders(array);
//		if(listofLeaders.size()!=0) {
//			System.out.println("Leaders: " + listofLeaders);
//		}
		
		Deque<Integer> leadersQue = l.getLeaders(array);
		if(leadersQue.size()!=0){
			System.out.println("Leaders: "+leadersQue);
		}
	}

}
