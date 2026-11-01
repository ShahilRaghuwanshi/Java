/*
 * Creating 2D Jagged Array while taking length as input from the user
 */
package Arrays2D;

import java.util.*;

public class Jagged2D_Array_whileTakingLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1D length of arra y to create two dimensional array ");
		int[][] arr = new int[sc.nextInt()][];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the 2D lenght od 1D " + i);
			arr[i] = new int[sc.nextInt()];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter array elements to store in array arr [" + i + "] [" + j + "]");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
