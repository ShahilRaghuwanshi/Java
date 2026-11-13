/*
 * Reverse a String
*/

package Strings;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(str);
		
		char[] ch = str.toCharArray();
		int j = ch.length - 1;
		
		char[] ch1 = new char[ch.length];
		
		for(int i = 0; i < ch.length; i++) {
			ch1[j] = ch[i];
			j--;
		}
		
		String s1 = new String(ch1);
		System.out.println(s1);
	}
}
