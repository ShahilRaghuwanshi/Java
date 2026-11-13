/*
 * compareTo(): -  
 * compareTo() is used to compare two strings character by character and check 
 * which amongst the two strings is greater.
 * 
 * if it give's positive number then string 1 is greater
 * if it give's negative number then string 2 is greater
 * if it give's 0 then both strings are equal
*/

package Strings.Strings_ImmutableStrings;

public class Eg10 {

	public static void main(String[] args) {
		
		String s1 = "Sachin";
		String s2 = "Sourav";
		
		if(s1.compareTo(s2) > 0) {
			System.out.println("String 1 is greater");
		}
		else if(s1.compareTo(s2) < 0) {
			System.out.println("String 2 is greater");
		}
		else {
			System.out.println("Strings are equal");
		}
		
		String s3 = "Sachin";
		String s4 = "Sourav";
		
		if(s3.compareTo(s4) > 0) {
			System.out.println("String 3 is greater");
		}
		else if(s3.compareTo(s4) < 0) {
			System.out.println("String 4 is greater");
		}
		else {
			System.out.println("Strings are equal");
		}

		String s5 = "Sachin";
		String s6 = "Sachin";
		
		if(s5.compareTo(s6) > 0) {
			System.out.println("String 5 is greater");
		}
		else if(s5.compareTo(s6) < 0) {
			System.out.println("String 6 is greater");
		}
		else {
			System.out.println("Strings are equal");
		}

	}
}
