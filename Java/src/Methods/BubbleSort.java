package Methods;

import java.util.*;

public class BubbleSort {

	Scanner sc = new Scanner(System.in);
	
	//Type - 1
	void bubbleSort1() {
		
		//Taking array length
		System.out.println("Enter array length: ");
		
		//Creating array
		int[] arr = new int[sc.nextInt()];
		
		//Taking array elements
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//logic of BubbleSort
		for(int i = 0; i <= arr.length - 2; i++) {
			for(int j = 0; j <= arr.length - 2 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int help = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = help;
				}
			}
		}
		
		//Printing array contents
		System.out.println("Array contents are: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
	
	//Type - 2 Method
	void bubbleSort2(int[] arr)
	{

		//logic of BubbleSort
		for(int i = 0; i <= arr.length - 2; i++) {
			for(int j = 0; j <= arr.length - 2 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int help = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = help;
				}
			}
		}
				
		//Printing array contents
		System.out.println("Array contents are: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
	
	//Type - 3 Method
	int[] bubbleSort3() 
	{
		//Taking array length
		System.out.println("Enter array length: ");
				
		//Creating array
		int[] arr = new int[sc.nextInt()];
				
		//Taking array elements
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
				
		//logic of BubbleSort 
		for(int i = 0; i <= arr.length - 2; i++) {
			for(int j = 0; j <= arr.length - 2 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int help = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = help;
				}
			}
		}
		return arr;
		
	}
	
	//Type - 4 Method
	int[] bubbleSort4(int[] arr) {
		//logic of BubbleSort 
		for(int i = 0; i <= arr.length - 2; i++) {
			for(int j = 0; j <= arr.length - 2 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int help = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = help;
				}
			}
		}
		return arr;
		
	}
}
