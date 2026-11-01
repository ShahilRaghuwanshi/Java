/*
 * Creating 3D jagged array by taking length as inut from the user
 */
package Arrays.Arrays3D;
import java.util.*;

public class Jagged3D_whileTakingInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Creating 3D array by taking length as input
		int[][][] arr = new int[sc.nextInt()][][];
		
		//Taking 2D length and crating array
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[sc.nextInt()][];
		}
		
		//For each 1st and 2nd D taking 3D length and creating array
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = new int[sc.nextInt()];
			}
		}
		
		//Taking array elements as input from keyboard and storing in array 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.println("[" + i + "] [" + j + "] [" + k + "]");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		//Display the array contents
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
