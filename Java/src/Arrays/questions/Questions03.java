/*Question : 
 * Enter array length 
 * : 5 
 * 
 * array of length 5 created 
 * 
 * Enter 5 numbers :
 * 10
 * 20
 * 30
 * 40
 * 50
 * 
 * entered elements stored in array
 * arr ...> 10, 20, 30, 40, 50
 * 
 * Enter two positions to swap 
 * 2
 * 4
 * 
 * Array elements after swapping
 * arr ...> 10, 20, 50, 40, 30
 */

package Arrays.questions;
import java.util.*;

public class Questions03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Array of length " + n + " created. ");
		
		System.out.println("Enter " + n + " numbers : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are ...> ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("Enter 2 position to swap : ");
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		
		int temp = arr[p1];
		arr[p1] = arr[p2];
		arr[p2] = temp;
		
		System.out.println("Array elements after swapping : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
