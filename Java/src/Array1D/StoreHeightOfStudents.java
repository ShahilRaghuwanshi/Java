/*
 * Write a java program to create appropriate type and length array
 * and store the specified details in the created array 
 * according to the below given scenario
 * 
 * scenario:
 * players   height 
 * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 
*/

package Array1D;
import java.util.*;
public class StoreHeightOfStudents {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] arr = new float[8];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("player " + i + " Enter Height : ");
			arr[i] = sc.nextFloat();
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Player : " + i + " height " + arr[i]);
		}
	}
}
