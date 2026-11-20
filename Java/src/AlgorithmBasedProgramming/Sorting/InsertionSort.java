/*
 * Write a java program to sort the concepts of an integer array in ascending order 
 * by using insertion  sort algorithm
 * 
 * Note: - The statement to sort an algorithm should be written in a method by name
 * insertionSort() which would accept an integer array as parameter and would return void
 * 
 * Sample output 1:
 * enter array length
 * 5
 * 
 * enter array elements
 * 86
 * 42
 * 23
 * 18
 * 25
 * 
 * elements before sorting
 * 86 42 23 18 25
 * 
 * elements after sorting
 * 18 23 25 42 86
 * 
*/

package AlgorithmBasedProgramming.Sorting;

import java.util.*;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		//Taking array length
		System.out.println("Enter array length : ");
		int n = sc.nextInt();
		
		//Creating an array
		int[] arr = new int[n];
		
		//Taking array elements
		System.out.println("Enter array element : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
 	}
}
