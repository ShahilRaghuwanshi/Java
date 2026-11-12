/*
 * Point: When you will combine two raw strings and create a new string 
 * the string will always be created in a constant pool
*/

package Strings_ImmutableStrings;

public class Eg6 {

	public static void main(String[] args) {
		
		String s1 = "Om";
		String s2 = "Kar";
		
		String s3 = "Om" + "Kar";
		String s4 = "Om" + "Kar";
		
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
