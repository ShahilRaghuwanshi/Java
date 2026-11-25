package Methods.Type2;

import java.util.Scanner;

import Methods.Type1.LinearSearch;

public class SearchApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length: ");
		
		//creating an array 
		int[] arr = new int[sc.nextInt()];
		
		//Taking array elements 
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter array element for index: " + i);
			arr[i] = sc.nextInt();
		}
		
		//Taking key to search 
		System.out.println("Enter a key: ");
		int key = sc.nextInt();
		
		Search ls = new Search();

		ls.linearSearch(arr, key);
		
	}
}
