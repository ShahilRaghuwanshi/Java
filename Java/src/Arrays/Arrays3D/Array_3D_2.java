/*
 * Scenario :- Store the amount of customer
 * 
 * Banks		Branches		Customer's
 * 0			0				0	1
 * 				1				0	1	2
 * 
 * 1			0				0	1
 * 				1				0	1	2
 * 				2				0	1	2	3
 * 
 * 2			0				0	
 * 				1				0	1	2	3
 * 				2				0	1
 * 				3				0	1	2
 */

package Arrays.Arrays3D;
import java.util.*;

public class Array_3D_2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int[][][] arr =  new int[3][][];
	
	arr[0] = new int[2][];
	arr[1] = new int[3][];
	arr[2] = new int[4][];
	
	arr[0][0] = new int[2];
	arr[0][1] = new int[3];
	
	arr[1][0] = new int[2];
	arr[1][1] = new int[3];
	arr[1][2] = new int[4];
	
	arr[2][0] = new int[1];
	arr[2][1] = new int[4];
	arr[2][2] = new int[2];
	arr[2][3] = new int[3];
	
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			for(int k = 0; k < arr[i][j].length; k++) {
				
				System.out.println("Enter the amount of bank " + i + " branch " + j + " customer " + k);
				arr[i][j][k] = sc.nextInt();	
				
			}
		}
	}
	
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
