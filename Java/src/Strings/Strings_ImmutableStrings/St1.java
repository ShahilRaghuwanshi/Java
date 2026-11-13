/*
 * Convert a string to character array
 */
package Strings.Strings_ImmutableStrings;

public class St1 {

	public static void main(String[] args) {
		
		String str = "Kodnest Technologies";
		
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
