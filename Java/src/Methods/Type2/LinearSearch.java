//LinearSearch (Type - 2)

package Methods.Type2;

import java.util.Scanner;

public class LinearSearch {

	void linearSearch(int[] arr, int key) {
		
		//linear search
		for(int i = 0; i < arr.length; i++) {
			if(key == arr[i]) {
				System.out.println("Key found at index: " + i);
				return;
			}
		}
		
		System.out.println("Key not found");
	}
}
