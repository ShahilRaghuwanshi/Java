/*
 * Sorting by using BubbleSort algorithm 
 * Sorting : Sorting is the process of arranging the data either in ascending or descending order
*/

package AlgorithmBasedProgramming.Sorting;

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];

		//Taking array elements
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter array element : ");
			arr[i] = sc.nextInt();
		}
		
		//Printing array elements before sorting
		System.out.println("Array elements before swapping : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//BubbleSort
		int help;
		for(int i = 0; i < n - 2; i++) {
			for(int j = 0; j < n - 2 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					help = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = help;
				}
			}
		}
		
		//Printing array elements after sorting
		System.out.println("Array elements after swapping : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
