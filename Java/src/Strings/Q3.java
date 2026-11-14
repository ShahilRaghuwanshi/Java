/*
 * Reverse a String while Preserving the space
*/

package Strings;

import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println("Entered String : " + str);
		
		char[] arr1 = str.toCharArray();
		char[] arr2 = new char[arr1.length];
		
		//Copying the space from arr1 to arr2
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == ' ') {
				arr2[i] = arr1[i];
			}
		}
		
		//copy the contents from arr1 to arr2 in reverse direction
		int j = arr2.length - 1;
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != ' ') {
				if(arr2[j] == ' ') {
					j--;
				}
				
				arr2[j] = arr1[i];
				j--;
				
			}
		}
		
		str = new String(arr2);
		System.out.println("Reversed String : " + str);
	}
}
