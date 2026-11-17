/*
 * BinarySearch:- 
 * 1. If your Binary Search has to work properly then the input you have to give in ascending order only
 * 2. Why BinarySearch is called as binary search :
 * we dividing the array exactly at the middle 
 * Always we divide the array into exactly two halves it is by 
 * by means binary 
 * 3. It is your duty to order the elements in the ascending order and give it to binary search 
 * (Sort in ascending order)
 * 
*/

package AlgorithmBasedProgramming.Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Enter array elements : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter key to search : ");
		int key = sc.nextInt();
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low < high) {
			
			int mid = (low + high) / 2;
			
			if(key == arr[mid]) {
				System.out.println("Key found at index at : " + mid);
				System.exit(0);
			}
			else if(key > arr[mid]) {
				low = mid + 1;
				high = high;
			}
			else {
				high = mid - 1;
				low = low;
			}
		}
		
		System.out.println("Key not found");
	}
}
