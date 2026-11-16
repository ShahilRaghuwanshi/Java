/*
 * Write a java program to search an element in an array
 * arr -> 10, 20, 30, 40, 50
 * key = 50
*/

package AlgorithmBasedProgramming.Searching;

import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of array : ");
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("Enter array element at the index : " + i);
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter a key to search : ");
		int key = sc.nextInt();
		
		for(int i = 0; i < arr1.length; i++) {
			if(key == arr1[i]) {
				System.out.println("Key found at the index : " + i);
				System.exit(0);
			}
		}
		System.out.println("Key not found");
	}
}
