/*
 * Creating 3D jagged array by taking length as inut from the user
 */
package Arrays.Arrays3D;
import java.util.*;

public class Jagged3D_whileTakingInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][][] arr = new int[sc.nextInt()][][];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[sc.nextInt()][];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = new int[sc.nextInt()];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k] + " ");
				}
			}
		}
	}
}
