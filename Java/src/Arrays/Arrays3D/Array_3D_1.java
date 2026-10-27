/*
 * Write a java program to create an appropriate length and dimension array
 * and store the data in the array by taking the input from keyboard.
 * Display the contents of the array on to the console.
 * According to the below given scenario.
 * 
 * Scenario :- Store marks of students
 * 
 * schools		classes			students
 * 0			0				0	1	2	3
 * 				1				0	1	2	3
 * 				2				0	1	2	3
 * 
 * 1			0				0	1	2	3
 * 				1				0	1	2	3
 * 				2				0	1	2	3
 */

package Arrays.Arrays3D;
import java.util.*;
public class Array_3D_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][][] arr = new int[2][3][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					
					System.out.println("Enter the mark's of school " + i + " class " + j + " student " + k);
					arr[i][j][k] = sc.nextInt();	
					
				}
			}
		}
		System.out.println("Array contents are >___");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					
					System.out.print(arr[i][j][k] + " ");	
					
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
