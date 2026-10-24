/*
 * Scenario : - Store the height of every player
 * Game 		Players
 * 0			0	1
 * 1			0	1
 * 2			0	1	2	3	4	5	6
 * 3			0	1	2
 * 4			0	1	2	3
 * 5			0	1	2	3	4
 * 6			0	1	2
 * 7			0	1
 */

package Arrays2D;
import java.util.*;
public class Array2D_JaggedArray_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float[][] arr = new float[8][];
		arr[0] = new float[2];
		arr[1] = new float[2];
		arr[2] = new float[7];
		arr[3] = new float[3];
		arr[4] = new float[4];
		arr[5] = new float[5];
		arr[6] = new float[3];
		arr[7] = new float[2];
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the height of Game " + i + " Player " + j);
				arr[i][j] = sc.nextFloat();
			}
		}
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
