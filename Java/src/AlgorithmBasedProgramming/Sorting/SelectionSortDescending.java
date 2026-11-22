package AlgorithmBasedProgramming.Sorting;

import java.util.Scanner;

public class SelectionSortDescending {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		//Taking array elements
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//selection sort
		for(int i = 0; i < n - 1; i++) {
			int max = arr[i];
			int pos = i;
			
			for(int j = i + 1; j < n; j++) {
				if(max < arr[j]) {
					max = arr[j];
					pos = j;
				}
			}
			
			int help = arr[i];
			arr[i] = arr[pos];
			arr[pos] = help;
		}
		
		System.out.println("Array contents after swapping: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
