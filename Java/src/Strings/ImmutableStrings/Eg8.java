/*
 * Assigning - Copied reference variable of string 
 * If you are assign one reference variable string reference variable
 * to another reference variable, reference would be copied
*/

package Strings.ImmutableStrings;

public class Eg8 {

	public static void main(String[] args) {
		
		String s1 = "Om";
		String s2 = s1;
		
		if(s1 == s2) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are unequal");
		}
		
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are unequal");
		}
	}
}
