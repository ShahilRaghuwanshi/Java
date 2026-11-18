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

		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter array element : ");
			arr[i] = sc.nextInt();
		}
	}
}
