//LinearSearch (Type - 3)

package Methods.Type3;

import java.util.Scanner;

public class LinearSearch3 {

	int linearSearch() {
		
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
		
		//linear search
		for(int i = 0; i < arr.length; i++) {
			if(key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
