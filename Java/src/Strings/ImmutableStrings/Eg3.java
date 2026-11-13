/*
 * Non-Constant Pool
*/

package Strings.ImmutableStrings;

public class Eg3 {

	public static void main(String[] args) {
		
		// non constant pool duplicates are allowed
		String s1 = new String("Omkar");
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
