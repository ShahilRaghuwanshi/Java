/*
 * Write a java program to create 1D array of String. 
 * collect length for creating the array accept one string as input and 
 * insert the string into array at the position decided by the user. 
 */
package Arrays.questions;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of an array : ");
		String[] arr = new String[sc.nextInt()];
		
			System.out.println("Enter a position between 0 to " + (arr.length - 1));
			int pos = sc.nextInt();
			System.out.println("Enter a string which you want to store at specific pos : ");
			arr[pos] = sc.next();
			
			System.out.println(arr[pos]);
	}
}
