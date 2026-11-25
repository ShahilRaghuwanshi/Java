package Methods.Type4;

import java.util.Scanner;

public class SearchApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Taking array length
		System.out.println("Enter array length: ");
		int[] arr = new int[sc.nextInt()];
		
		//Taking array elements
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//Taking key to search
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		
		//calling method
		LinearSearch4 ls = new LinearSearch4();
		int i = ls.linearSearch(arr, key);
		
		if(i >= 0) System.out.println("Key Found at Index: " + i);
		else System.out.println("Key Not Found");
		
	}
}
