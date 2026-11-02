/*
 * taking length form user in 4D array
 */
package Arrays.Arrays4D;
import java.util.*;

public class Array4D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lengths of 4D array ");
		int[][][][] arr = new int[sc.nextInt()][sc.nextInt()][sc.nextInt()][sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					for(int l = 0; l < arr[i][j][k].length; l++) {
						System.out.println("Enter the element : ");
						arr[i][j][k][l] = sc.nextInt();
					}
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					for(int l = 0; l < arr[i][j][k].length; l++) {
						System.out.print(arr[i][j][k][l] + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
