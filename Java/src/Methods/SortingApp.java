package Methods;

import java.util.*;

public class SortingApp {

	public static void main(String[] args) 
	{
		
		//creating object of BubbleSort class
		BubbleSort bs = new BubbleSort();
		
		bs.bubbleSort1();			//Calling Type - 1 Method
		System.out.println("=================================");
		
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
		System.out.println("=================================");

		int[] arr1 = bs.bubbleSort3(); //Calling Type - 3 Method
		
		//Printing array contents
		System.out.println("Array contents are: ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
		System.out.println("=================================");

		//Taking array length
		System.out.println("Enter array length: ");
						
		//Creating array
		int[] arr2 = new int[sc.nextInt()];
						
		//Taking array elements
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int[] arr3 = bs.bubbleSort4(arr2); //Calling Type - 4 Method
		
		//Printing array contents
		System.out.println("Array contents are: ");
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i] + " ");
		}
		System.out.println("=================================");

		//String Array
		System.out.println("Enter the length of Steing array: ");
		//Creating String array 
		String[] s = new String[sc.nextInt()];
		
		//Taking elements 
		System.out.println("Enter String Array Elements: ");
		for(int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		
		//Printing string array
		String[] s1 = bs.bubbleSort5(s);
		System.out.println("String array contents are: ");
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");
		}
	}
	
}
