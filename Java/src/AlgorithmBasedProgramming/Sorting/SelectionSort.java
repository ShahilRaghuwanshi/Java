/*
 * Write a java program to sort the elements of an integer array in ascending order 
 * by using selection sort algorithm 
 * 
 * Note: The statement of selection sort algorithm should be kept in a method 
 * by name selectionSort()  which would accept an integer array as input and 
 * would return void
 * 
 * Sample output 1 : 
 * enter array length 
 * 5
 * enter array elements
 * 86
 * 42
 * 23
 * 18
 * 25
 * elements before sorting
 * 86 42 23 18 25
 * elements after sorting
 * 18 23 25 42 86  
 * 
*/

package AlgorithmBasedProgramming.Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Taking array length
		System.out.println("Enter array length : ");
		int n = sc.nextInt();
		
		//Creating array 
		int[] arr = new int[n];
		
		//Taking array elements 
		System.out.println("Enter array elements : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//Array elements before sorting 
		System.out.println("array elements before sorting : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		selectionSort(arr);
	}
	
	public static void selectionSort(int[] arr ) {
		for(int i =0; i < arr.length - 1; i++) {
			int min = arr[i];
			int pos = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			int help = arr[i];
			arr[i] = arr[pos];
			arr[pos] = help;
		}
		
		//Array elements after sorting 
		System.out.println("array elements after sorting : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
