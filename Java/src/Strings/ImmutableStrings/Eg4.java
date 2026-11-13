/*
 * Non-Constant Pool and Constant pool
*/

package Strings.ImmutableStrings;

public class Eg4 {

	public static void main(String[] args) {
		
		// non constant pool duplicates are allowed and constant pool duplicates are not allowed
		String s1 = "Omkar";
		String s2 = new String("Omkar");
		
		if(s1 == s2) {
			System.out.println("Refereces are equal");
		}
		else {
			System.out.println("Refereces are unequal");
		}
		
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are unequal");
		}
	}
}
