/*
 * Write a java program to create an appropriate dimension and length array
 * according to the below given scenario
 * 
 * scenario :-
 * 
 * classes     students
 * 0			0 1 2
 * 1			0 1 2
 * 2			0 1 2
 * 3			0 1 2
 * 		
 */
package Arrays;
import java.util.*;
public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
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
