package src.actualpractice.important;

import java.util.*;

public class LeaderElements {
	// Problem : Write a program to print all the LEADERS in the array. An element
	// is a leader if it is greater than
	// all the elements to its right side. And the rightmost element is always a
	// leader.
	// For example in the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

	public static void main(String[] args) {
		int arr[] = {10,8,9,7,2,3};

		// METHOD 1(BEGINNER): Brute force,easy to understand | COMPLEXITY | O(n2)
//		if(arr==null || arr.length==0) {
//			System.out.println("No leaders(Empty array)!");
//		}
//		else {
//			int count=0;
//			for(int i=0; i<arr.length;i++) {
//				boolean isLeader = true;
//				for(int j=i+1; j<arr.length; j++) {
//					if(arr[j]>=arr[i]) {
//						isLeader=false;
//						break;
//					}
//				}
//				if(isLeader) {
//					count++;
//					System.out.print(arr[i]);
//					if(i!=arr.length-1) {
//						System.out.print(",");
//					}
//				}
//			}
//			System.out.println();
//			System.out.println("Number of leader elements: "+ count);
//		}

//		// METHOD 2(INTERMEDIATE): Starting array iteration from right, using array
//		// list,easy to understand | COMPLEXITY | O(n)
//		if (arr == null || arr.length == 0) {
//			System.out.println("No leaders present because array is empty");
//		} else {
//			List<Integer> leaders = new ArrayList<Integer>();
//			leaders.add(arr[arr.length - 1]);
//			int maxFromRight = arr[arr.length - 1];
//
//			for (int i = arr.length - 2; i >= 0; i--) {
//				if(arr[i] > maxFromRight) {
//					leaders.add(arr[i]);
//					maxFromRight = arr[i];
//				}
//			}
//			Collections.reverse(leaders);
//			System.out.println("Leaders: "+ leaders);
//		}
		//METHOD 4(EXPERT): Using ArrayDeque and Loops, | COMPLEXITY - O(n),
		// EASY TO UNDERSTAND
		if (arr == null || arr.length == 0) {
		System.out.println("No leaders present because array is empty");
		}
		else {
			Deque<Integer> leadersQue = new ArrayDeque<Integer>();
			leadersQue.addFirst(arr[arr.length-1]);
			int maxFromRight = arr[arr.length-1];
			for(int i = arr.length-2; i>=0; i--) {
				if(arr[i] > maxFromRight) {
					leadersQue.addFirst(arr[i]);
					maxFromRight = arr[i];
				}
			}
			if(leadersQue.size()!=0) {
				System.out.println("Leaders: "+leadersQue);
			}
		}
		
	}

}
