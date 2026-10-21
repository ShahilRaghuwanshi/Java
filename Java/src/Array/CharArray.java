/*
 * Take char as input and store it in charArray
 */
package Array;
import java.util.*;
public class CharArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of an array");
		int n = sc.nextInt();
		
		char[] ch = new char[n];
		
		for(int i = 0; i < ch.length; i++) {
			System.out.println("Enter character at i : " + i);
			ch[i] = sc.next().charAt(0);
 		}
		
		for(int i = 0; i < ch.length; i++) {
			System.out.println("character at i " + ch[i]);
 		}
	}
}
