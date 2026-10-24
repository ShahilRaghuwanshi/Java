/*
 * Write a java Program to create appropriate length and dimension array.
 * Store the data into the array by taking the input from the user and 
 * display the contents of the array onto the console according to below given 
 * scenario.
 * 
 * Scenario : - Store the ages of the students 
 * classes		 students
 * 0			0	1	2	3
 * 1			0	1
 * 2			0	1	2
 * 3			0	1	2	3	4
 * 
 */

package Arrays2D;
import java.util.*;
public class Array2D_JaggedArray_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][];
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the age of class "+ i +" studnet : " + j);
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
