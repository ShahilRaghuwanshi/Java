package Methods;

import java.util.*;

public class SortingApp {

	public static void main(String[] args) 
	{
		
		//creating object of BubbleSort class
		BubbleSort bs = new BubbleSort();
		
		bs.bubbleSort1();			//Calling Type - 1 Method
		
		Scanner sc = new Scanner(System.in);
		
		//Taking array length
		System.out.println("Enter array length: ");
				
		//Creating array
		int[] arr = new int[sc.nextInt()];
				
		//Taking array elements
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		bs.bubbleSort2(arr);		//Calling Type - 2 Method
		
	}
}
