//LinearSearch (Type - 1)

package Methods.Type1;

import java.util.Scanner;

public class LinearSearch {

	void linearSearch() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		
		//creating an array 
		int[] arr = new int[n];
		
		//Taking array elements 
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter array element for index: " + i);
			arr[i] = sc.nextInt();
		}
		
		//Taking key to search 
		System.out.println("Enter a key: ");
		int key = sc.nextInt();
		
		//linear search
		for(int i = 0; i < arr.length; i++) {
			if(key == arr[i]) {
				System.out.println("Key found at index: " + i);
				System.exit(0);
			}
		}
		System.out.println("Key not found");
	}
}
