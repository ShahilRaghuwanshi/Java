/*
 * When you will concatenate the reference of two strings to create a string 
 * String would not sit in Constant Pool
 * rather String would be created in Non-Constant Pool
 * 
 * Hence again one more string 
 * because in Non-Constant Pool duplicates are allowed 
*/

package Strings;

public class Eg7 {

	public static void main(String[] args) {
		
		String s1 = "Om";
		String s2 = "Kar";
		
		String s3 = s1 + s2;
		String s4 = s1 + s2;
		
		if(s3 == s4) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are unequal");
		}
		
		if(s3.equals(s4)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are unequal");
		}
	}
}
