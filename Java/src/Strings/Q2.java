/*
 * WAJP to check given string is palindrome or not.
*/

package Strings;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println("Entered String is : " + str);
		
		char[] ch = str.toCharArray();
		char[] ch1 = new char[ch.length];
		
		int j = ch.length - 1;
		
		for(int i = 0; i < ch.length; i++) {
			ch1[j] = ch[i];
			j--;
		}
		
		String str1 = new String(ch1);
		System.out.println("Reversed String : " + str);
		
		if(str.equals(str1)) {
			System.out.println("String is plindrome");
		}
		else {
			System.out.println("String is not plindrome");
		}
 	}
	
}
