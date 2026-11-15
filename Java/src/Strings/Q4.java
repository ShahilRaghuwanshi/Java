/*
 * Reverse each word in a String
*/

package Strings;

import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		String revsentence = "";
		
		for(int i = 0; i < arr.length; i++) {
			
			String word = arr[i];
			String revword = "";
			
			for(int j = word.length() - 1; j >= 0; j--) {
				revword = revword + word.charAt(j);
			}
			
			revsentence = revsentence + revword + " ";
		}
		System.out.println("Original String : " + str);
		System.out.println("Reverse String : " + revsentence);
	}
}
