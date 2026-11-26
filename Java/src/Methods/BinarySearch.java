package Methods;

import java.util.Scanner;

public class BinarySearch {

	Scanner sc = new Scanner(System.in);
	
	//Type - 1 Method
	void binarySearch1() {
		
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
		
		//Logic of Binary Search
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(key == arr[mid]) {
				System.out.println("Key found at index : " + mid);
				return;
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
		
		System.out.println("Key Not Found");
 	}
	
	//Type - 2 Method
	void binarySearch2(int[] arr, int key) {
		//Logic of Binary Search
		int low = 0;
		int high = arr.length - 1;
				
		while(low <= high) {
					
			int mid = (low + high) / 2;
					
			if(key == arr[mid]) {
				System.out.println("Key found at index : " + mid);
				return;
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
				
		System.out.println("Key Not Found");
	}
	
	//Type - 3 Method
	int binarySearch3() {
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
		
		//Logic of Binary Search
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(key == arr[mid]) {
				return mid;
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
		
		return -1;
	}
	
	//Type - 4 Method
	int binarySearch4(int[] arr, int key) {
	//Logic of Binary Search
		int low = 0;
		int high = arr.length - 1;
				
		while(low <= high) {
					
			int mid = (low + high) / 2;
					
			if(key == arr[mid]) {
				return mid;
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
		return -1;
	}
}
