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
		//Type - 1
		bs.binarySearch1();
		
		//Type - 2
		bs.binarySearch2(arr, key);
		
		//Type - 3
		int res1 = bs.binarySearch3();
		if(res1 >= 0) System.out.println("Key Found at idex: " + res1);
		else System.out.println("Key Not Found");
		
		//Type - 4
		int res2 = bs.binarySearch4(arr, key);
		if(res2 >= 0) System.out.println("Key Found at idex: " + res1);
		else System.out.println("Key Not Found");
		
	}
}
