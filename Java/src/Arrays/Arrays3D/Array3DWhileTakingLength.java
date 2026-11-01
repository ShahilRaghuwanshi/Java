/*
 * Creating 3D Array while taking the length from the user
 */
package Arrays.Arrays3D;
import java.util.*;
public class Array3DWhileTakingLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[][][] arr = new int[sc.nextInt()][sc.nextInt()][sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter the element of 3D array [" + i + "] [" + j + "] [" + k + "]");
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
