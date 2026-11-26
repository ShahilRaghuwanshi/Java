package Methods;

import java.util.Scanner;

public class SearchApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length: ");
		
		//Creating array by given length 
		int[] arr = new int[sc.nextInt()];
		
		//Taking array elements
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//Taking Key
		System.out.println("Enter key: ");
		int key = sc.nextInt();

		//Creating Object of BinarySearch class
		BinarySearch bs = new BinarySearch();
		
		//Calling methods
		bs.binarySearch1();
	}
}
